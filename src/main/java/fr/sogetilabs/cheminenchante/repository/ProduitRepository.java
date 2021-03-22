package fr.sogetilabs.cheminenchante.repository;

import fr.sogetilabs.cheminenchante.model.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProduitRepository extends MongoRepository <Produit, String> {


}
