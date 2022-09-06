package com.In5bmGrupo6.models.dao;

/**
 *
 * @author Sergio Cruz Velasquez 
 * @date Sep 2, 2022
 * @time 10:14:56 PM
 *
 */

import com.In5bmGrupo6.models.domain.Juegos;
import com.In5bmGrupo6.models.idao.IJuegosDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.In5bmGrupo6.db.Conexion;
import java.sql.SQLException;

public class JuegosDaoImpl implements IJuegosDAO{

     private static final String SQL_SELECT = "Select id_juego, nombre_juego, fecha_lanzamiento, precio, desarrolladora_id, distribuidora_id, genero_id from juegos";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Juegos juegos = null;
    private List<Juegos> listaJuegos = new ArrayList<>();

    @Override
    public List<Juegos> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                juegos = new Juegos(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7));
                listaJuegos.add(juegos);
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
        return listaJuegos;
    }

    @Override
    public boolean add(Juegos juegos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Juegos juegos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Juegos juegos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
