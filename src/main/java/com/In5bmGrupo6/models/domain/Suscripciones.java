
package com.In5bmGrupo6.models.domain;

/**
 *
 * @author Luis Carlos Pérez
 * @date 3/09/2022
 * @time 09:37:37
 * 
 *Código técnico: IN5BM
 *
 */
public class Suscripciones {
    private int idSuscripcion;
    private String tipoSuscripcion;
    
    public Suscripciones() {    
    }
    
    public Suscripciones(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }
    
    public Suscripciones(String tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }
    
    public Suscripciones(int idSuscripcion, String tipoSuscripcion) {
        this.idSuscripcion = idSuscripcion;
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void setTipoSuscripcion(String tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }

    @Override
    public String toString() {
        return "Suscripciones{" + "idSuscripcion=" + idSuscripcion + ", tipoSuscripcion=" + tipoSuscripcion + '}';
    }
}