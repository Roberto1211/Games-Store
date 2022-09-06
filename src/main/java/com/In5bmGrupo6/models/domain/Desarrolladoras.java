
package com.In5bmGrupo6.models.domain;

/**
 *
 * @author Luis Carlos Pérez
 * @date 3/09/2022
 * @time 12:42:00
 * 
 *Código técnico: IN5BM
 *
 */
public class Desarrolladoras {
    
    private int id;
    private String nombreDesarrolladora;
    
    public Desarrolladoras() {
    }
    
    public Desarrolladoras(int id) {
        this.id = id;
    }
    
    public Desarrolladoras(String nombreDesarrolladora) {
        this.nombreDesarrolladora = nombreDesarrolladora;
    }
    
    public Desarrolladoras (int id, String nombreDesarrolladora) {
        this.id = id;
        this.nombreDesarrolladora = nombreDesarrolladora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDesarrolladora() {
        return nombreDesarrolladora;
    }

    public void setNombreDesarrolladora(String nombreDesarrolladora) {
        this.nombreDesarrolladora = nombreDesarrolladora;
    }

    @Override
    public String toString() {
        return "Desarrolladoras{" + "id=" + id + ", nombreDesarrolladora=" + nombreDesarrolladora + '}';
    }
    
    
}
