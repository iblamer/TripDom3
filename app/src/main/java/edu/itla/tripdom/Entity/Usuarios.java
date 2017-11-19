package edu.itla.tripdom.Entity;

/**
 * Created by fabio on 11/13/2017.
 */

public class Usuarios {
    private int usuarioId;
    private String nombreUsuario;
    private TipoUsuario tipoUsuario;
    private String email;
    private String telefono;


    //region getters & setters
    public String getEmail() {
        return email;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }


    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }


    //endregion


    @Override
    public String toString() {
        return "Usuarios{" +
                "usuarioId=" + usuarioId +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }


}