package com.In5bmGrupo6.models.dao;

import com.In5bmGrupo6.db.Conexion;
import com.In5bmGrupo6.models.domain.Generos;
import com.In5bmGrupo6.models.idao.IGeneroDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TulioJimènez
 */

public class GenerosDaoImpl implements IGeneroDAO {

    private static final String SQL_SELECT = "Select id_genero, tipo_genero from generos";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Generos genero = null;
    private List<Generos> listaGeneros = new ArrayList<>();

    @Override
    public List<Generos> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                genero = new Generos(rs.getInt(1), rs.getString(2));
                listaGeneros.add(genero);
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
        return listaGeneros;
    }

    @Override
    public boolean add(Generos genero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Generos genero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Generos genero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
