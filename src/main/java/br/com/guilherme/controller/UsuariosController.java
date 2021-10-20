package br.com.guilherme.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;



import br.com.guilherme.model.Usuarios;
import br.com.guilherme.service.UsuariosService;
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
	@Autowired
	private UsuariosService usuariosService;
	
	
	

    @GetMapping("/forminsert")
    public String insert(Model model) {
        Usuarios usuarios = new Usuarios();
        model.addAttribute("usuarios", usuarios);
        return "index";
    }

   

    @PostMapping("/insert")
    public String insert(@ModelAttribute("Usuarios") Usuarios usuarios) {
        Usuarios resultusuarios = usuariosService.insert(usuarios);
        if (resultusuarios != null) {
            return "usuarios/success";
        }
        return "usuarios/error";
    }
}