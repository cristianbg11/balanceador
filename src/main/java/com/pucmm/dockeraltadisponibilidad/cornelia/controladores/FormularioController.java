package com.pucmm.dockeraltadisponibilidad.cornelia.controladores;

import com.pucmm.dockeraltadisponibilidad.cornelia.entidadPublica;
import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Formulario;
import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Usuario;
import com.pucmm.dockeraltadisponibilidad.cornelia.seguridad.CurrentUsuario;
import com.pucmm.dockeraltadisponibilidad.cornelia.seguridad.UsuarioPrincipal;
import com.pucmm.dockeraltadisponibilidad.cornelia.servicios.FormularioServicio;
import com.pucmm.dockeraltadisponibilidad.cornelia.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class FormularioController {
    @Autowired
    FormularioServicio formularioServicio;

    @Autowired
    UsuarioServicio usuarioServicio;

    @RequestMapping("formulario")
    public ModelAndView indice(@CurrentUsuario UsuarioPrincipal usuarioPrincipal, ModelAndView model) {
        entidadPublica entidadPublica = new entidadPublica();

        model.addObject("formulario", entidadPublica);
        model.addObject("usuario", usuarioPrincipal);
        model.setViewName("formulario");

        return model;
    }

    @RequestMapping(value = "/submit", method = RequestMethod.GET)
    public String submit(@CurrentUsuario UsuarioPrincipal currentUser,
                         @RequestParam("resultado1") String resultado1,
                         @RequestParam("resultado2") String resultado2,
                         @RequestParam("resultado3") String resultado3,
                         @RequestParam("resultado4") String resultado4) {
        Usuario usuario = usuarioServicio.getUsuario(currentUser.getUsername()).orElse(null);

        if(usuario == null) {
            return "redirect:/login";
        }

        Formulario formulario = new Formulario();
        formulario.setResultado1(Integer.valueOf(resultado1));
        formulario.setResultado2(Integer.valueOf(resultado2));
        formulario.setResultado3(Integer.valueOf(resultado3));
        formulario.setResultado4(Integer.valueOf(resultado4));
        formulario.setPregunta1("1");
        formulario.setPregunta2("2");
        formulario.setPregunta3("3");
        formulario.setPregunta4("4");
        formulario.setUsuario(usuario);

        formularioServicio.guardar(formulario);

        return "redirect:/formulario";
    }
}
