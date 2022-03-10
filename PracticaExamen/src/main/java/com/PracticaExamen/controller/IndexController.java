package com.PracticaExamen.controller;

import com.PracticaExamen.domain.Cancion;
import com.PracticaExamen.domain.Contacto;
import com.PracticaExamen.service.ContactoService;
import com.PracticaExamen.service.CancionService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private CancionService cancionService;
    @Autowired
    private ContactoService contactoService;
    
    @RequestMapping("/")
    public String inicio(Model model) {
        log.info("Pagina para crear playlists");
        
        String bienvenida = "¡Bienvenidx!"
                + "\nPor medio de esta pagina podras crear tus playlists con tus canciones favoritas"
                + "\nPresiona Crear Playlist para comenzar";
        model.addAttribute("MensajeBienvenida", bienvenida);
        
        return "index";
    }
    @GetMapping("/miplaylist")
    public String miplaylist(Model model){
        
        var cancionesDB = cancionService.getCanciones();
        model.addAttribute("cancionesDB", cancionesDB);
        
        return "miplaylist";
    }
    @GetMapping("/contactenos")
    public String contactenos(Contacto contacto){
        return "contactenos";
    }
    @PostMapping("/guardarContacto")
    public String guardarContacto(Contacto contacto){
        contactoService.save(contacto);
        return "redirect:/";
    }
    @GetMapping("/modificar/{idcancion}")
    public String modificar(Cancion cancion, Model model){
        var respuesta = cancionService.getCancion(cancion);
        model.addAttribute("cancion", respuesta);
        return "modificar";
    }
}
