package com.In5bmGrupo6.models.domain;

/**
 *
 * @author joser
 */
public class Empleados {
    private int id_empleado;
    private int persona_id;

    public Empleados() {
    }

    public Empleados(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Empleados(int id_empleado, int persona_id) {
        this.id_empleado = id_empleado;
        this.persona_id = persona_id;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }
}
