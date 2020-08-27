package com.pucmm.dockeraltadisponibilidad.cornelia.controladores;

import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Formulario;
import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Usuario;
import com.pucmm.dockeraltadisponibilidad.cornelia.seguridad.CurrentUsuario;
import com.pucmm.dockeraltadisponibilidad.cornelia.seguridad.UsuarioPrincipal;
import com.pucmm.dockeraltadisponibilidad.cornelia.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    UsuarioServicio usuarioServicio;

    @Autowired
    AuthenticationManager authenticationManager;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(@CurrentUsuario UsuarioPrincipal currentUser) {
        ModelAndView modelAndView = new ModelAndView();

        if (currentUser == null) {
            Usuario user = new Usuario();
            modelAndView.addObject("usuario", user);
            modelAndView.setViewName("index");
        } else {
            modelAndView.setViewName("formulario");
            modelAndView.addObject("usuario", currentUser);
            Formulario form = new Formulario();
            modelAndView.addObject("formulario", form);
        }
        return modelAndView;
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {

        ModelAndView mav = new ModelAndView();

        Usuario user = new Usuario();
        mav.addObject("usuario", user);

        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value = "/entrar", method = RequestMethod.GET)
    public String login(@RequestParam("usuario") String usuario, @RequestParam("contraisenia") String contraisenia) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(usuario, contraisenia));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        System.out.println(usuario + " " + contraisenia);

        Usuario userExists = usuarioServicio.getUsuario(usuario).get();

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("user", userExists);

        modelAndView.setViewName("formulario");

        return "redirect:/formulario";
    }

}
