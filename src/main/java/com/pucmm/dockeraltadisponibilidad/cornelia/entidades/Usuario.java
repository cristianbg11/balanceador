package com.pucmm.dockeraltadisponibilidad.cornelia.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Usuario implements Serializable {
    @Id
    private String usuario;
    private String contraisenia;

    public Usuario() {

    }

    public Usuario(String usuario, String contraisenia) {
        this.usuario = usuario;
        this.contraisenia = contraisenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraisenia() {
        return contraisenia;
    }

    public void setContraisenia(String contraisenia) {
        this.contraisenia = contraisenia;
    }
}
