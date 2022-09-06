package com.In5bmGrupo6.models.idao;

import com.In5bmGrupo6.models.domain.Roles;
import java.util.List;

/**
 * @author Tulio Jimenez
 */
public interface IRolesDAO {
    
    //Listar todos los registros
    public List<Roles> getAll(); 
    
    //Insertar registro
    public boolean add(Roles estudiante);
    
    //Actualizar un registro
    public boolean update(Roles estudiante);
    
    //Eliminar registro
    public boolean delete(Roles estudiante);
}