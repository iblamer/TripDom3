package edu.itla.tripdom.Entity;

/**
 * Created by fabio on 11/13/2017.
 */

public class PublicacionDetalle {
    private int id;
    private int publicacionId;
    private String lugar;
    private String descripcion;
    public String prueba;

    public int getId() {
        return id;
    }

    public int getPublicacionId() {
        return publicacionId;
    }

    public String getLugar() {
        return lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPublicacionId(int publicacionId) {
        this.publicacionId = publicacionId;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
