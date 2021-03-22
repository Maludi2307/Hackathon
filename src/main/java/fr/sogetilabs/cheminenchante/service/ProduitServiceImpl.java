package fr.sogetilabs.cheminenchante.service;

import fr.sogetilabs.cheminenchante.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProduitServiceImpl implements ProduitService {

    @Autowired
    UniversRepository repository;

    @Override
    public void createProduit (List<Produit> produit ){
        repository.saveAll(produit);
    }




}
