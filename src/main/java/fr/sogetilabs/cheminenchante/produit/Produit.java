package fr.sogetilabs.cheminenchante.produit;

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

    public Produit() {

    }

    public Produit(String id, String nomProduit, float hauteurProduit, float largeurProduit, float profondeurProduit, float poidsProduit) {
        this.nomProduit = nomProduit;
        this.hauteurProduit = hauteurProduit;
        this.largeurProduit = largeurProduit;
        this.profondeurProduit = profondeurProduit;
        this.poidsProduit = poidsProduit;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id='" + id + '\'' +
                ", nomProduit='" + nomProduit + '\'' +
                ", hauteurProduit=" + hauteurProduit +
                ", largeurProduit=" + largeurProduit +
                ", profondeurProduit=" + profondeurProduit +
                ", poidsProduit=" + poidsProduit +
                '}';
    }
}
