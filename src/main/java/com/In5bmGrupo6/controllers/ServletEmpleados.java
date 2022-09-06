package com.In5bmGrupo6.controllers;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import java.util.List;
import com.In5bmGrupo6.models.dao.EmpleadosDaoImpl;
import com.In5bmGrupo6.models.domain.Empleados;

/**
 *
 * @author informatica
 */

@WebServlet("/ServletEmpleado")
public class ServletEmpleados extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarEmpleados(request, response);
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
    
    private void listarEmpleados(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Empleados> listaEmpleados = new EmpleadosDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listaEmpleados", listaEmpleados);
        response.sendRedirect("empleados/empleados.jsp");
    }
}