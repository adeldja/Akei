package com.example.akei;

import android.content.Intent;

public class Vehicule {
    private String marque;
    private String modele;
    private Double cubage;
    private Double longueur;
    private Double largeur;
    private Double hauteur;
    private String immatriculation;
    private String typeCarburant;
    private Integer nbKms;
    private String typeVehicule;
    private Magasin leMagasin;

    public  Vehicule(String marque, String modele, Double cubage, Double longueur, Double largeur, Double hauteur, String immatriculation, String typeCarburant, Integer nbKms, String typeVehicule, Magasin leMagasin){
        this.marque = marque;
        this.modele = modele;
        this.cubage = cubage;
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.immatriculation = immatriculation;
        this.typeCarburant = typeCarburant;
        this.nbKms = nbKms;
        this.typeVehicule = typeVehicule;
        this.leMagasin = leMagasin;
    }

    public Magasin getLeMagasin() {
        return leMagasin;
    }

    public void setLeMagasin(Magasin leMagasin) {
        this.leMagasin = leMagasin;
    }

    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }

    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }

    public Double getCubage() { return cubage; }
    public void setCubage(Double cubage) { this.cubage = cubage; }

    public Double getLongueur() { return longueur; }
    public void setLongueur(Double longueur) { this.longueur = longueur; }

    public Double getLargeur() { return largeur; }
    public void setLargeur(Double largeur) { this.largeur = largeur; }

    public Double getHauteur() { return hauteur; }
    public void setHauteur(Double hauteur) { this.hauteur = hauteur; }

    public String getImmatriculation() { return immatriculation; }
    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }

    public String getTypeCarburant() { return typeCarburant; }
    public void setTypeCarburant(String typeCarburant) { this.typeCarburant = typeCarburant; }

    public Integer getNbKms() { return nbKms; }
    public void setNbKms(Integer nbKms) { this.nbKms = nbKms; }

    public String getTypeVehicule() { return typeVehicule; }
    public void setTypeVehicule(String typeVehicule) { this.typeVehicule = typeVehicule; }

    @Override
    public String toString() {
        return marque +" "+ modele + "\n" +"type  :  "  + typeVehicule;
    }
}