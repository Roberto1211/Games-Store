
package com.In5bmGrupo6.models.dao;

/**
 *
 * @author Luis Carlos Pérez
 * @date 3/09/2022
 * @time 12:50:33
 * 
 *Código técnico: IN5BM
 *
 */

import com.In5bmGrupo6.models.domain.Desarrolladoras;
import com.In5bmGrupo6.models.idao.IDesarrolladorasDAO;
import com.In5bmGrupo6.db.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class DesarrolladoraDaoImpl implements IDesarrolladorasDAO{
    
    private static final String SQL_SELECT = "select id, nombre_desarrolladora from empresas_desarrolladoras";
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Desarrolladoras desarrolladora = null;
    private List<Desarrolladoras> listaDesarrolladoras = new ArrayList<>();
    
    @Override
    public List<Desarrolladoras> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                desarrolladora = new Desarrolladoras(rs.getInt("id"), rs.getString("nombre_desarrolladora"));
                listaDesarrolladoras.add(desarrolladora);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaDesarrolladoras;
    }
    
    @Override
    public boolean add(Desarrolladoras desarrolladora) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Desarrolladoras desarrolladora) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Desarrolladoras desarrolladora) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}