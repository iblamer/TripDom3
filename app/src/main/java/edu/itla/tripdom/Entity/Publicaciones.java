package edu.itla.tripdom.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by fabio on 11/13/2017.
 */



public class Publicaciones {
    private int publicacionId;
    private Date fechaPublicacion;
    private Date fechaViaje;
    private float costo;
    private String descripcion;
    private boolean status;
    private Usuarios usuario;
    private String origen;
    private int cupo;
    private List<PublicacionDetalle> detalle;

    public List<PublicacionDetalle> getDetalle() {
        return detalle;
    }

    public void addDetalle(PublicacionDetalle publicacionDetalle){
        if(detalle == null)
        {
            detalle = new ArrayList<>();
        }
        publicacionDetalle.setPublicacion(this);
        detalle.add(publicacionDetalle);
    }

    //region getters & setters

    public int getPublicacionId() {
        return publicacionId;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public float getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isStatus() {
        return status;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public String getOrigen() {
        return origen;
    }

    public int getCupo() {
        return cupo;
    }

    public void setPublicacionId(int publicacionId) {
        this.publicacionId = publicacionId;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    //endregion
}
