package com.In5bmGrupo6.models.dao;

/**
 *
 * @author Sergio Cruz Velasquez 
 * @date Sep 2, 2022
 * @time 10:14:56 PM
 *
 */

import com.In5bmGrupo6.models.domain.ListaDeseados;
import com.In5bmGrupo6.models.idao.IListaDeseadosDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.In5bmGrupo6.db.Conexion;
import java.sql.SQLException;

public class ListaDeseadosDaoImpl implements IListaDeseadosDAO{

     private static final String SQL_SELECT = "Select id_lista, juego_id, fecha_agregado, cliente_id from listas_deseados";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private ListaDeseados Deseados = null;
    private List<ListaDeseados> listaDeseados = new ArrayList<>();

    @Override
    public List<ListaDeseados> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Deseados = new ListaDeseados(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getInt(4));
                listaDeseados.add(Deseados);
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
        return listaDeseados;
    }

    @Override
    public boolean add(ListaDeseados Deseados) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(ListaDeseados Deseados) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(ListaDeseados Deseados) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
