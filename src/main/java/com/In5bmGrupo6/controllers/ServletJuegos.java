package com.In5bmGrupo6.controllers;

/**
 *
 * @author Sergio Cruz Velasquez 
 * @date Sep 2, 2022
 * @time 10:11:10 PM
 *
 */

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import java.util.List;
import com.In5bmGrupo6.models.dao.JuegosDaoImpl;
import com.In5bmGrupo6.models.domain.Juegos;

@WebServlet("/Servletjuego")
public class ServletJuegos extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "listar":
                    listaJuegos(request, response);
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
    
    private void listaJuegos(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Juegos> listaJuegos = new JuegosDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listaJuegos", listaJuegos);
        response.sendRedirect("juegos/juegos.jsp");
    }
    
}
