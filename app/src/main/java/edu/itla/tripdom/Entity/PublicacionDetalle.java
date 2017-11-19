package edu.itla.tripdom.Entity;

    /**
 * Created by fabio on 11/13/2017.
 */

public class PublicacionDetalle {
    private int id;
    private Publicaciones publicacion;
    private String lugar;
    private String descripcion;

    //region getter & setter
    public int getId() {
        return id;
    }

    public Publicaciones getPublicacionId() {
        return publicacion;
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

    public void setPublicacion(Publicaciones publicacionId) {
        this.publicacion = publicacionId;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //endregion

}
