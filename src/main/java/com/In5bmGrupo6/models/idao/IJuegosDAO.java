package com.In5bmGrupo6.models.idao;

import com.In5bmGrupo6.models.domain.Juegos;
import java.util.List;

/**
 *
 * @author Roberto Saldaña
 * @date 30-08-2022
 * @time 08:55:00 AM
 * Código Técnico; IN5BM
 */

public interface IJuegosDAO {
    
    //Listar todos los registros
    public List<Juegos> getAll(); 
    
    //Insertar registro
    public boolean add(Juegos juego);
    
    //Actualizar un registro
    public boolean update(Juegos juego); 
    
    //Eliminar registro
    public boolean delete(Juegos juego);
}