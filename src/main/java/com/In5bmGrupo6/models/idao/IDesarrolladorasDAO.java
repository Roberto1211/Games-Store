package com.In5bmGrupo6.models.idao;

import java.util.List;
import com.In5bmGrupo6.models.domain.Desarrolladoras;

/**
 *
 * @author Luis Carlos Pérez
 */

public interface IDesarrolladorasDAO {
    
    public List<Desarrolladoras> getAll();
    
    public boolean add(Desarrolladoras desarrolladora);
    
    public boolean update(Desarrolladoras desarrolladora);
    
    public boolean delete(Desarrolladoras desarrolladora);
}