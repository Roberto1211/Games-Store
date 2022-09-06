package com.In5bmGrupo6.models.idao;

import com.In5bmGrupo6.models.domain.Clientes;
import java.util.List;

/**
 *
 * @author Roberto Saldaña
 * @date 30-08-2022
 * @time 08:55:00 AM
 * Código Técnico; IN5BM
 */

public interface IClientesDAO {
    
    //Listar todos los registros
    public List<Clientes> getAll(); 
    
    //Insertar registro
    public boolean add(Clientes estudiante);
    
    //Actualizar un registro
    public boolean update(Clientes estudiante); 
    
    //Eliminar registro
    public boolean delete(Clientes estudiante);
}