package fr.sogetilabs.cheminenchante.service;

import org.springframework.data.annotation.Id;

public class Univers {

    @Id
    public String id;
    public String nomUnivers ;

    public Univers () {

    }

    public Univers(String nomUnivers) {
        this.nomUnivers = nomUnivers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomUnivers() {
        return nomUnivers;
    }

    public void setNomUnivers(String nomUnivers) {
        this.nomUnivers = nomUnivers;
    }

    @Override
    public String toString() {
        return "Univers{" +
                "id='" + id + '\'' +
                ", nomUnivers='" + nomUnivers + '\'' +
                '}';
    }
}
