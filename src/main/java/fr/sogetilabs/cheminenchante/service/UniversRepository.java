package fr.sogetilabs.cheminenchante.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversRepository  extends MongoRepository <Univers, String> {




}
