package com.In5bmGrupo6.models.dao;

import com.In5bmGrupo6.db.Conexion;
import com.In5bmGrupo6.models.domain.Roles;
import com.In5bmGrupo6.models.idao.IRolesDAO;
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

public class RolesDaoImpl implements IRolesDAO {

    private static final String SQL_SELECT = "Select id_rol,descripcion_rol from roles";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Roles roles = null;
    private List<Roles> listaRoles = new ArrayList<>();

    @Override
    public List<Roles> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                roles = new Roles(rs.getInt(1), rs.getString(2));
                listaRoles.add(roles);
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
        return listaRoles;
    }

    @Override
    public boolean add(Roles roles) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Roles roles) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Roles roles) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
