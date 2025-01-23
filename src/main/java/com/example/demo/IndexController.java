package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("titulo", "GAMESTORE");
        model.addAttribute("mensaje", "Bienvenido a la mejor tienda de juegos!");
        return "index";
    }
    
    @GetMapping("/about")
    public String index2(Model model) {
        model.addAttribute("titulo", "SOBRE NOSOTROS");
        model.addAttribute("mensaje", "Bienvenido a la mejor tienda de juegos!");
        return "about";
    }

    @GetMapping("/catalogo")
    public String index3(Model model) {
        model.addAttribute("titulo", "CATÁLOGO");
        model.addAttribute("mensaje", "Bienvenido a la mejor tienda de juegos!");
        return "catalogo";
    }

    @GetMapping("/bot")
    public String index4(Model model) {
        model.addAttribute("titulo", "BOT");
        model.addAttribute("mensaje", "Bienvenido a la mejor tienda de juegos!");
        return "bot";
    }
    
    
}
