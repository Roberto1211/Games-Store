package com.In5bmGrupo6.controllers;

import com.In5bmGrupo6.models.dao.GenerosDaoImpl;
import com.In5bmGrupo6.models.domain.Generos;
import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author TulioJimènez
 */
    

@WebServlet("/ServletGenero")
public class ServletGeneros extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarGeneros(request, response);
                    break;
                case "editar":

                    break;
                case "eliminar":

                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
    private void listarGeneros(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Generos> listaGeneros = new GenerosDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listaGeneros", listaGeneros);
        response.sendRedirect("generos/generos.jsp");
    }
}