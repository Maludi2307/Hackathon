package fr.sogetilabs.cheminenchante.controller;

import fr.sogetilabs.cheminenchante.model.Produit;
import fr.sogetilabs.cheminenchante.service.ProduitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/produits")
public class ProduitController {

    @Autowired
    @Qualifier(value = "produitService")
    ProduitService serv;

    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    /**
     * Method to fetch all users from the db.
     * @return
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Collection<Produit> getAll() {
        System.out.println("-------> : getAllProduits");
        logger.debug("Getting all produits.");
        return serv.getAllProduits();
    }




}
