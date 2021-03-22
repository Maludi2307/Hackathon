package fr.sogetilabs.cheminenchante.univers;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversRepository  extends MongoRepository <Univers, String> {




}
