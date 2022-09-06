package com.In5bmGrupo6.models.dao;

import com.In5bmGrupo6.models.domain.Personas;
import com.In5bmGrupo6.models.idao.IPersonaDAO;
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

public class PersonasDaoImpl implements IPersonaDAO {

    private static final String SQL_SELECT = "Select id_persona, nombre1, nombre2, nombre3, apellido1, apellido2, email, fecha_nacimiento, telefono, direccion from personas";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Personas persona = null;
    private List<Personas> listaPersonas = new ArrayList<>();

    @Override
    public List<Personas> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                persona = new Personas(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getString(9), rs.getString(10));
                listaPersonas.add(persona);
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
        return listaPersonas;
    }

    @Override
    public boolean add(Personas persona) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Personas persona) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Personas persona) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
