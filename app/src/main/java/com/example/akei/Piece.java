package com.example.akei;

import java.util.ArrayList;

public class Piece {

    private String libellePiece;
    private String descPiece;
    private ArrayList<Employe> lesEmployes = new ArrayList<Employe>();
    private ArrayList<Produit> lesProduits = new ArrayList<Produit>();


    public Piece(String libellePiece, String descPiece) {
        this.libellePiece = libellePiece;
        this.descPiece = descPiece;
    }
    public  void addEmployes(Employe leEmploye){
        lesEmployes.add(leEmploye);
    }
    public  void addProduit(Produit leProduit){
        lesProduits.add(leProduit);
    }

    public  ArrayList<Employe> getLesEmployes() {
        return lesEmployes;
    }

    public  ArrayList<Produit> getLesProduits() {
        return lesProduits;
    }

    public String getLibellePiece() {
        return libellePiece;
    }

    public void setLibellePiece(String libellePiece) {
        this.libellePiece = libellePiece;
    }

    public String getDescPiece() {
        return descPiece;
    }

    public void setDescPiece(String descPiece) {
        this.descPiece = descPiece;
    }

    @Override
    public String toString() {
        return  libellePiece  + "\n" + descPiece;
    }
}
