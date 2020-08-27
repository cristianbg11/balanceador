package com.pucmm.dockeraltadisponibilidad.cornelia;

import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Usuario;
import com.pucmm.dockeraltadisponibilidad.cornelia.repository.UsuarioRepository;
import com.pucmm.dockeraltadisponibilidad.cornelia.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.RedirectViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
@SpringBootApplication
public class CorneliaApplication {

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	UsuarioServicio usuarioServicio;


	public static void main(String[] args) {
		SpringApplication.run(CorneliaApplication.class, args);
	}


	@Bean
	public CommandLineRunner cargarDatos(UsuarioRepository repository) {
		return (args -> {
			Usuario usuario = new Usuario();

			usuario.setContraisenia("admin");
			usuario.setUsuario("admin");

			Usuario usuario1 = new Usuario();
			usuario1.setUsuario("usuario");
			usuario1.setContraisenia("usuario");
			usuarioServicio.guardar(usuario);
			usuarioServicio.guardar(usuario1);
		});
	}

}
