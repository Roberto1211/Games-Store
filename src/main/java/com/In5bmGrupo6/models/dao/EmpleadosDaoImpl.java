package com.In5bmGrupo6.models.dao;

import com.In5bmGrupo6.models.domain.Empleados;
import com.In5bmGrupo6.models.idao.IEmpleadoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.In5bmGrupo6.db.Conexion;
import java.sql.SQLException;

/**
 *
 * @author Roberto Saldaña
 * @date 30-08-2022
 * @time 08:55:00 AM Código Técnico: IN5BM
 */
public class EmpleadosDaoImpl implements IEmpleadoDAO {

    private static final String SQL_SELECT = "select id_empleado, persona_id from empleados";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Empleados empleado = null;
    private List<Empleados> listaEmpleados = new ArrayList<>();

    @Override
    public List<Empleados> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                empleado = new Empleados(rs.getInt(1),rs.getInt(2));
                listaEmpleados.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaEmpleados;
    }

    @Override
    public boolean add(Empleados empleado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Empleados empleado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Empleados empleado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
