package fr.sogetilabs.cheminenchante.produit;

import fr.sogetilabs.cheminenchante.univers.Univers;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProduitRepository extends MongoRepository <Produit, String> {


}
