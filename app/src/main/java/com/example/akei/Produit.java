package com.example.akei;

public class Produit {
    private String nomP;
    private String desc_tech;
    private double prix;
    private Integer longueur;
    private Integer largeur;
    private Integer hauteur;
    private Integer poids;
    private Piece laPiece;

    public Produit(String nomP, String desc_tech, double prix, Integer longueur, Integer largeur, Integer hauteur, Integer poids, Piece laPiece){
        this.nomP = nomP;
        this.desc_tech = desc_tech;
        this.prix = prix;
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.poids = poids;
        this.laPiece = laPiece;
 }

    public Piece getLaPiece() {
        return laPiece;
    }

    public void setLaPiece(Piece laPiece) {
        this.laPiece = laPiece;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public String getDesc_tech() {
        return desc_tech;
    }

    public void setDesc_tech(String desc_tech) {
        this.desc_tech = desc_tech;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Integer getLongueur() {
        return longueur;
    }

    public void setLongueur(Integer longueur) {
        this.longueur = longueur;
    }

    public Integer getLargeur() {
        return largeur;
    }

    public void setLargeur(Integer largeur) {
        this.largeur = largeur;
    }

    public Integer getHauteur() {
        return hauteur;
    }

    public void setHauteur(Integer hauteur) {
        this.hauteur = hauteur;
    }

    public Integer getPoids() {
        return poids;
    }

    public void setPoids(Integer poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return nomP ;
    }
}
