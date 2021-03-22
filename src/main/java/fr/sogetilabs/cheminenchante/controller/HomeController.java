package fr.sogetilabs.cheminenchante.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class HomeController {

    @GetMapping
    public String hello (){
        return "Est-ce qu'enfin ça fonctionne ce put*** de fuck*** bor*** de mer*** ?";
    }




}
