package br.com.guilherme.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;



import br.com.guilherme.model.Newsletter;
import br.com.guilherme.service.NewsletterService;
@RestController
@RequestMapping("/newsletter")
public class NewsletterController {



	@Autowired
	private NewsletterService newsletterService;
	
	
	


   

    @PostMapping("/insert")
    public String insert(@ModelAttribute("Newsletter") Newsletter newsletter) {
    	Newsletter resultnewsletter = newsletterService.insert(newsletter);
        if (resultnewsletter != null) {
            return "Usuarios/success";
        }
        return "Usuarios/error";
    }
}