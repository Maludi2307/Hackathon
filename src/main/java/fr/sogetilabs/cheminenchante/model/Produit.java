package fr.sogetilabs.cheminenchante.model;

import org.springframework.data.annotation.Id;

public class Produit {

    @Id
    public String id;

    public String nomProduit;
    //public String nomLongProduit;

    public float hauteurProduit;  //hauteur en cm
    public float largeurProduit;  //largeur en cm
    public float profondeurProduit; //profondeur en cm
    public float poidsProduit; // poids en kg
    public String universProduit;
    public String rayonProduit;

    public Produit() {
    }

     public Produit(String id, String nomProduit, float hauteurProduit, float largeurProduit, float profondeurProduit, float poidsProduit) {
        this.nomProduit = nomProduit;
        this.hauteurProduit = hauteurProduit;
        this.largeurProduit = largeurProduit;
        this.profondeurProduit = profondeurProduit;
        this.poidsProduit = poidsProduit;
        this.universProduit = universProduit;
        this.rayonProduit = rayonProduit;
    }

    //---------------------------------------------------------------
    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public float getHauteurProduit() {
        return hauteurProduit;
    }

    public void setHauteurProduit(float hauteurProduit) {
        this.hauteurProduit = hauteurProduit;
    }

    public float getLargeurProduit() {
        return largeurProduit;
    }

    public void setLargeurProduit(float largeurProduit) {
        this.largeurProduit = largeurProduit;
    }

    public float getProfondeurProduit() {
        return profondeurProduit;
    }

    public void setProfondeurProduit(float profondeurProduit) {
        this.profondeurProduit = profondeurProduit;
    }

    public float getPoidsProduit() {
        return poidsProduit;
    }

    public void setPoidsProduit(float poidsProduit) {
        this.poidsProduit = poidsProduit;
    }

    public String getUniversProduit() {
        return universProduit;
    }

    public void setUniversProduit(String universProduit) {
        this.universProduit = universProduit;
    }

    public String getRayonProduit() {
        return rayonProduit;
    }

    public void setRayonProduit(String rayonProduit) {
        this.rayonProduit = rayonProduit;
    }
    //----------------------------------------------------------------

    @Override
    public String toString() {
        return "Produit{" +
                "id='" + id + '\'' +
                ", nomProduit='" + nomProduit + '\'' +
                ", hauteurProduit=" + hauteurProduit +
                ", largeurProduit=" + largeurProduit +
                ", profondeurProduit=" + profondeurProduit +
                ", poidsProduit=" + poidsProduit +
                ", universProduit=" + universProduit +
                ", rayonProduit=" + rayonProduit +
                '}';
    }
}
