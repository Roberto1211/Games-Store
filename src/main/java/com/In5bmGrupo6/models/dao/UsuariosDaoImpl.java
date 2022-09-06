package com.In5bmGrupo6.models.dao;

import com.In5bmGrupo6.models.domain.Usuarios;
import com.In5bmGrupo6.models.idao.IUsuarioDAO;
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
public class UsuariosDaoImpl implements IUsuarioDAO {

    private static final String SQL_SELECT = "select user, pass, correo_electronico, persona_id, rol_id from usuarios";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Usuarios usuario = null;
    private List<Usuarios> listaEmpleados = new ArrayList<>();

    @Override
    public List<Usuarios> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                usuario = new Usuarios(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
                listaEmpleados.add(usuario);
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
    public boolean add(Usuarios empleado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Usuarios empleado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Usuarios empleado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
