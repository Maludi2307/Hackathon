package fr.sogetilabs.cheminenchante.service;

import fr.sogetilabs.cheminenchante.model.Produit;
import fr.sogetilabs.cheminenchante.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;

public class ProduitServiceImpl implements ProduitService {

    @Autowired
    ProduitRepository repository;

    @Override
    public void createProduit (List<Produit> produit ){
        repository.saveAll(produit);
    }

    @Override
    public Collection<Produit> getAllProduits () {
        return repository.findAll();
    }






}
