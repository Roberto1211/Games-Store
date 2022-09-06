package com.In5bmGrupo6.models.dao;

/**
 *
 * @author Sergio Cruz Velasquez 
 * @date Sep 2, 2022
 * @time 10:14:56 PM
 *
 */

import com.In5bmGrupo6.models.domain.Clientes;
import com.In5bmGrupo6.models.idao.IClientesDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.In5bmGrupo6.db.Conexion;
import java.sql.SQLException;

public class ClientesDaoImpl implements IClientesDAO{

     private static final String SQL_SELECT = "Select id_cliente, nit, persona_id, suscripcion_id from clientes";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Clientes clientes = null;
    private List<Clientes> listaClientes = new ArrayList<>();

    @Override
    public List<Clientes> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                clientes = new Clientes(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
                listaClientes.add(clientes);
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
        return listaClientes;
    }

    @Override
    public boolean add(Clientes cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Clientes cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Clientes cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
