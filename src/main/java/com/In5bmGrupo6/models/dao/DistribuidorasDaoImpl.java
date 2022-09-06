package com.In5bmGrupo6.models.dao;

import com.In5bmGrupo6.models.domain.Distribuidoras;
import com.In5bmGrupo6.models.idao.IDistribuidorasDAO;
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
public class DistribuidorasDaoImpl implements IDistribuidorasDAO {

    private static final String SQL_SELECT = "select id, nombre_distribuidora from distribuidoras";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Distribuidoras distribuidoras = null;
    private List<Distribuidoras> listaDistribuidoras = new ArrayList<>();

    @Override
    public List<Distribuidoras> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                distribuidoras = new Distribuidoras(rs.getInt(1),rs.getString(2));
                listaDistribuidoras.add(distribuidoras);
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
        return listaDistribuidoras;
    }

    @Override
    public boolean add(Distribuidoras empleado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Distribuidoras empleado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Distribuidoras empleado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
