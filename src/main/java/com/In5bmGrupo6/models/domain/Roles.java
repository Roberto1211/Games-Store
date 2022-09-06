package com.In5bmGrupo6.models.domain;

/**
 *
 * @author TulioJimènez
 */

public class Roles {

    private int id_rol;
    private String descripcion_rol;



    public Roles() {
    }

    public Roles(int id_rol) {
        this.id_rol = id_rol;
    }
    

    public Roles(String descripcion_rol) {
        this.id_rol = id_rol;
        this.descripcion_rol = descripcion_rol;
    }

    public Roles(int id_rol, String descripcion_rol) {
        this.id_rol = id_rol;
        this.descripcion_rol = descripcion_rol;  
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_genero) {
        this.id_rol = id_rol;
    }
    
     public String getDescripcion_rol() {
        return descripcion_rol;
    }

    public void setDescripcion_rol(String descripcion_rol) {
        this.descripcion_rol = descripcion_rol;
    }
}
