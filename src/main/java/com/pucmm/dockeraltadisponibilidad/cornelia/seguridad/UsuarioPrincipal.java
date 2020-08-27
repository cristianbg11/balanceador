package com.pucmm.dockeraltadisponibilidad.cornelia.seguridad;

import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Objects;

public class UsuarioPrincipal implements UserDetails {

    private String usuario;
    private String contraisenia;

    public UsuarioPrincipal(String username, String password) {
        this.usuario = username;
        this.contraisenia = password;
    }

    public static UsuarioPrincipal crear(Usuario usuario) {
        return new UsuarioPrincipal(usuario.getUsuario(), usuario.getContraisenia());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return contraisenia;
    }

    public void setPassword(String contraisenia) {
        this.contraisenia = contraisenia;
    }

    @Override
    public String getUsername() {
        return usuario;
    }

    public void setUsername(String username) {
        this.usuario = username;
    }



    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hash(usuario);
    }

}
