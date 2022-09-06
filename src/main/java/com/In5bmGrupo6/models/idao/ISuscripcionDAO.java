package com.In5bmGrupo6.models.idao;

import java.util.List;
import com.In5bmGrupo6.models.domain.Suscripciones;

/**
 *
 * @author Luis Carlos Pérez
 */
public interface ISuscripcionDAO {
    
    public List<Suscripciones> getAll();
    
    public boolean add(Suscripciones suscripcion);
    
    public boolean update(Suscripciones suscripcion);
    
    public boolean delete(Suscripciones suscripcion);
}