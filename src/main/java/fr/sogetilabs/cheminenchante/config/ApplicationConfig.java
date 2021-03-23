package fr.sogetilabs.cheminenchante.config;

import fr.sogetilabs.cheminenchante.service.ProduitService;
import fr.sogetilabs.cheminenchante.service.ProduitServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("fr.sogetilabs.cheminenchante")
public class ApplicationConfig {

    @Bean(name="produitService")
    public ProduitService getTopoService () {
        return new ProduitServiceImpl();
    }
}
