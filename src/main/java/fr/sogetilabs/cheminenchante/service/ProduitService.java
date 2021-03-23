package fr.sogetilabs.cheminenchante.service;

import fr.sogetilabs.cheminenchante.model.Produit;

import java.util.Collection;
import java.util.List;


public interface ProduitService {

    public void createProduit (List<Produit> emp);

    public Collection<Produit> getAllProduits();


}
