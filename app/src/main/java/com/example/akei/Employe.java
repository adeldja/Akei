package com.example.akei;

public class Employe {
    private String nom;
    private String prenom;
    private String tel;
    private String mail;
    private Magasin leMagasin;
    private Piece laPiece;

    public Employe(String nom, String prenom, String tel, String mail, Magasin leMagasin, Piece laPiece) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.leMagasin = leMagasin;
        this.laPiece = laPiece;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Magasin getLeMagasin() {
        return leMagasin;
    }

    public void setLeMagasin(Magasin leMagasin) {
        this.leMagasin = leMagasin;
    }

    public Piece getLaPiece() {
        return laPiece;
    }

    public void setLaPiece(Piece laPiece) {
        this.laPiece = laPiece;
    }

    @Override
    public String toString() {
        return  nom ;

    }
}
