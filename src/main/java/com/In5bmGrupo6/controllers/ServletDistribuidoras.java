package com.In5bmGrupo6.controllers;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import java.util.List;
import com.In5bmGrupo6.models.dao.DistribuidorasDaoImpl;
import com.In5bmGrupo6.models.domain.Distribuidoras;

/**
 *
 * @author informatica
 */

@WebServlet("/ServletDistribuidora")
public class ServletDistribuidoras extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "listar":
                    listaDistribuidoras(request, response);
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
    
    private void listaDistribuidoras(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Distribuidoras> listaDistribuidoras = new DistribuidorasDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listaDistribuidoras", listaDistribuidoras);
        response.sendRedirect("distribuidoras/distribuidoras.jsp");
    }
}