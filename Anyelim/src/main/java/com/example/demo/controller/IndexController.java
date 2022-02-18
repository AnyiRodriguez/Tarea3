package com.example.demo.controller;

import com.example.demo.dao.ClienteDao;
import com.example.demo.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    @Autowired
    private ClienteDao clienteDao;
    
    @RequestMapping("/")
    //@GetMappig("/")
    public String page(Model model) {
        //model.addAttribute("attribute", "value");
        log.info("Ahora se usa arquitectura MVC");
        String mensaje = "Mensaje desde el controlador";
        
        model.addAttribute("Mensaje", mensaje);
        Cliente cliente = new Cliente("Jonathan", "Brenes Blanco", "jbrenes@gmail.com", "8820-2655");
        model.addAttribute(cliente);
        
        Cliente cliente2 = new Cliente("Juan", "Rojas Perez", "jrojas@gmail.com", "8877-4466");
        var clientes = Arrays.asList(cliente, cliente2);
        model.addAttribute("clientes",clientes);
        
        var.clienteDB = clienteDao.findAll();
        model.addAttribute("clientesDB", clientesDB);
        
        return "index";
    }
    
    //@RequestMapping("/productos")
}
