package fr.sogetilabs.cheminenchante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/test")
    public String getTemplate(Model model){
        return "Template1";
    }
}
