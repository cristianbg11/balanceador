package com.pucmm.dockeraltadisponibilidad.cornelia.seguridad;

import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Usuario;
import com.pucmm.dockeraltadisponibilidad.cornelia.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;

@Service
public class UsuarioDetailService implements UserDetailsService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioDetailService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByUsuario(username);
        return UsuarioPrincipal.crear(usuario);
    }
}
