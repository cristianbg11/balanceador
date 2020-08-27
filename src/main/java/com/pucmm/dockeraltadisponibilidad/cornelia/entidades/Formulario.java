package com.pucmm.dockeraltadisponibilidad.cornelia.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Formulario implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long codigo;
    String pregunta1;
    Integer resultado1;
    String pregunta2;
    Integer resultado2;
    String pregunta3;
    Integer resultado3;
    String pregunta4;
    Integer resultado4;
    String pregunta5;
    Integer resultado5;

    @OneToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "usuario_codigo", nullable = false)
    private Usuario usuario;

    public String getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(String pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public Integer getResultado1() {
        return resultado1;
    }

    public void setResultado1(Integer resultado1) {
        this.resultado1 = resultado1;
    }

    public String getPregunta2() {
        return pregunta2;
    }

    public void setPregunta2(String pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public Integer getResultado2() {
        return resultado2;
    }

    public void setResultado2(Integer resultado2) {
        this.resultado2 = resultado2;
    }

    public String getPregunta3() {
        return pregunta3;
    }

    public void setPregunta3(String pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public Integer getResultado3() {
        return resultado3;
    }

    public void setResultado3(Integer resultado3) {
        this.resultado3 = resultado3;
    }

    public String getPregunta4() {
        return pregunta4;
    }

    public void setPregunta4(String pregunta4) {
        this.pregunta4 = pregunta4;
    }

    public Integer getResultado4() {
        return resultado4;
    }

    public void setResultado4(Integer resultado4) {
        this.resultado4 = resultado4;
    }

    public String getPregunta5() {
        return pregunta5;
    }

    public void setPregunta5(String pregunta5) {
        this.pregunta5 = pregunta5;
    }

    public Integer getResultado5() {
        return resultado5;
    }

    public void setResultado5(Integer resultado5) {
        this.resultado5 = resultado5;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
