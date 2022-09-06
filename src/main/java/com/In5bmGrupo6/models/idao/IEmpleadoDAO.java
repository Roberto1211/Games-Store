package com.In5bmGrupo6.models.idao;

import com.In5bmGrupo6.models.domain.Empleados;
import java.util.List;

/**
 *
 * @author Roberto Saldaña
 * @date 30-08-2022
 * @time 08:55:00 AM
 * Código Técnico; IN5BM
 */

public interface IEmpleadoDAO {
    
    //Listar todos los registros
    public List<Empleados> getAll(); 
    
    //Insertar registro
    public boolean add(Empleados estudiante);
    
    //Actualizar un registro
    public boolean update(Empleados estudiante);
    
    //Eliminar registro
    public boolean delete(Empleados estudiante);
}