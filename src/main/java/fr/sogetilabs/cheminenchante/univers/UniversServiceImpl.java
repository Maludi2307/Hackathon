package fr.sogetilabs.cheminenchante.univers;

import fr.sogetilabs.cheminenchante.univers.UniversRepository;
import fr.sogetilabs.cheminenchante.univers.Univers;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class UniversServiceImpl implements UniversService {

    @Autowired
    UniversRepository universR;

    @Override
    public void createUnivers (List<Univers> univers){
        universR.saveAll(univers);
    }




}
