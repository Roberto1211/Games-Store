package com.In5bmGrupo6.controllers;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import java.util.List;
import com.In5bmGrupo6.models.dao.RolesDaoImpl;
import com.In5bmGrupo6.models.domain.Roles;

/**
 *
 * @author TulioJimènez
 */

@WebServlet("/ServletRol")
public class ServletRoles extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarRoles(request, response);
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
    
    private void listarRoles(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Roles> listarRoles = new RolesDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listaRoles", listarRoles);
        response.sendRedirect("roles/roles.jsp");
    }
}