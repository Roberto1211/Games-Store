
package com.In5bmGrupo6.controllers;

/**
 *
 * @author Luis Carlos Pérez
 * @date 3/09/2022
 * @time 13:03:20
 * 
 *Código técnico: IN5BM
 *
 */

import com.In5bmGrupo6.models.dao.DesarrolladoraDaoImpl;
import com.In5bmGrupo6.models.domain.Desarrolladoras;
import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ServletDesarrolladora")
public class ServletDesarrolladora extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarSuscripciones(request, response);
                    break;
                case "editar":
                    
                    break;
                case "eliminar":
                    
                    break;
            }
        }
    }

    private void listarSuscripciones(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Desarrolladoras> listaDesarrolladora = new DesarrolladoraDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("data", listaDesarrolladora);
        response.sendRedirect("desarrolladoras/desarrolladoras.jsp");
    }
}
