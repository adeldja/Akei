package com.example.akei;

import android.util.Log;

import java.util.ArrayList;

public class Modele {
    public static ArrayList<Produit> produit = new ArrayList<Produit>();
    public static ArrayList<Piece> piece = new ArrayList<Piece>();
    public static ArrayList<Vehicule> vehicule = new ArrayList<Vehicule>();
    public static ArrayList<Employe> employes = new ArrayList<Employe>();
    public static ArrayList<Magasin> magasin = new ArrayList<Magasin>();
    public static void initDonnees() {

        // premiere piece
        Piece pT = new Piece("Cuisine", "Tables de cuisine , Chaise de cuisine , Chaise de bar ... ");
        Modele.piece.add(pT);

        //produit dans la piece pt
        Modele.produit.add(new Produit("Chair", "Chaise en plastique qui permet de manger proprement", 12.5, 10, 15, 6, 20,pT));
        Modele.produit.add(new Produit("Apluplastoc", "Table en plastique ", 12.5, 10, 15, 6, 20,pT));
        Modele.produit.add(new Produit("BarWood", "Chaise de bar en bois ", 12.5, 10, 15, 6, 20,pT));
        Modele.produit.add(new Produit("Serviette", "Serviette", 12.5, 10, 15, 6, 20,pT));
        Modele.piece.get(0).addProduit(Modele.produit.get(0));
        Modele.piece.get(0).addProduit(Modele.produit.get(1));
        Modele.piece.get(0).addProduit(Modele.produit.get(2));
        Modele.piece.get(0).addProduit(Modele.produit.get(3));

        // deuxieme piece
        Piece p1 = new Piece("Salle de Bain", "Douchette , Tabouret , Lavabo  ... ");
        Modele.piece.add(p1);

        //produit dans la piece pt
        Modele.produit.add(new Produit("Douchine", "Douchette", 12.5, 10, 15, 6, 20,p1));
        Modele.produit.add(new Produit("Tab-ourret", "Tabouret ", 12.5, 10, 15, 6, 20,p1));
        Modele.produit.add(new Produit("Lavabeau", "Lavabo ", 12.5, 10, 15, 6, 20,p1));
        Modele.produit.add(new Produit("Tas-py", "Tapis de sol", 12.5, 10, 15, 6, 20,p1));
        Modele.piece.get(1).addProduit(Modele.produit.get(4));
        Modele.piece.get(1).addProduit(Modele.produit.get(5));
        Modele.piece.get(1).addProduit(Modele.produit.get(6));
        Modele.piece.get(1).addProduit(Modele.produit.get(7));


        // troisieme piece
        Piece p2 = new Piece("Salon", "Meuble , Canape , Fauteuil  ... ");
        Modele.piece.add(p2);

        //produit dans la piece pt
        Modele.produit.add(new Produit("WoodenBock", "Meuble", 12.5, 10, 15, 6, 20,p2));
        Modele.produit.add(new Produit("Canap", "Canape ", 12.5, 10, 15, 6, 20,p2));
        Modele.produit.add(new Produit("Le Trone de coton", "Fauteuil ", 12.5, 10, 15, 6, 20,p2));
        Modele.produit.add(new Produit("Poussin", "Coussin", 12.5, 10, 15, 6, 20,p2));
        Modele.piece.get(2).addProduit(Modele.produit.get(8));
        Modele.piece.get(2).addProduit(Modele.produit.get(9));
        Modele.piece.get(2).addProduit(Modele.produit.get(10));
        Modele.piece.get(2).addProduit(Modele.produit.get(11));
        // quatrieme piece
        Piece p3 = new Piece("Chambre", "Lit , Bureau , Chaise  ... ");
        Modele.piece.add(p3);

        //produit dans la piece pt
        Modele.produit.add(new Produit("Beddeb", "Lit", 12.5, 10, 15, 6, 20,p3));
        Modele.produit.add(new Produit("Desk", "Bureau ", 12.5, 10, 15, 6, 20,p3));
        Modele.produit.add(new Produit("Siege-de chambre", "Chaise ", 12.5, 10, 15, 6, 20,p3));
        Modele.produit.add(new Produit("Apuntalaka", "Armoire", 12.5, 10, 15, 6, 20,p3));
        Modele.piece.get(3).addProduit(Modele.produit.get(12));
        Modele.piece.get(3).addProduit(Modele.produit.get(13));
        Modele.piece.get(3).addProduit(Modele.produit.get(14));
        Modele.piece.get(3).addProduit(Modele.produit.get(15));

        // magasin 5
        Magasin mB = new Magasin("Bayonne");
        Modele.magasin.add(mB);
        Magasin mT = new Magasin("Toulouse");
        Modele.magasin.add(mT);

        //Employes
        Modele.employes.add(new Employe("Ascone","Pierre","0673822984","pete64130@gmail.com",mB,pT));
        Modele.employes.add(new Employe("Choux","Francis","0615230574","fchoux@gmail.com",mB,p1));
        Modele.employes.add(new Employe("Fredric","Jean","0710504451","jean.f@gmail.com",mB,p2));
        Modele.employes.add(new Employe("Klaus","Sylvie","065481274","s.klaus@gmail.com",mB,p3));
        Modele.employes.add(new Employe("Lofan","Eva","0701010101","eva.lof@gmail.com",mT,pT));
        Modele.employes.add(new Employe("Cacoute","Serge","0615230574","serge@gmail.com",mT,p1));
        Modele.employes.add(new Employe("Potiron","Laura","0710456821","laura.p@gmail.com",mT,p2));
        Modele.employes.add(new Employe("Monaied","Sarana","065498654","s@gmail.com",mT,p3));
        Modele.magasin.get(0).addEmploye(Modele.employes.get(0));
        Modele.magasin.get(0).addEmploye(Modele.employes.get(1));
        Modele.magasin.get(0).addEmploye(Modele.employes.get(2));
        Modele.magasin.get(0).addEmploye(Modele.employes.get(3));
        Modele.magasin.get(1).addEmploye(Modele.employes.get(4));
        Modele.magasin.get(1).addEmploye(Modele.employes.get(5));
        Modele.magasin.get(1).addEmploye(Modele.employes.get(6));
        Modele.magasin.get(1).addEmploye(Modele.employes.get(7));

        // vehicule 5
        Modele.vehicule.add(new Vehicule("Fiat","Ducato",22.0,3.12,1.87,1.932,"AA 863 XX","essence",5000,"utilitaire",mB));
        Modele.vehicule.add(new Vehicule("Citroen","Jumpy",15.0,4.0,2.0,2.1,"BB 666 RR","gasoil",78000,"utilitaire",mB));
        Modele.vehicule.add(new Vehicule("Renault","Master",22.0,4.0,2.0,2.1,"ZZ 999 DD","gasoil",78000,"utilitaire",mT));
        Modele.magasin.get(0).addVehicules(Modele.vehicule.get(0));
        Modele.magasin.get(0).addVehicules(Modele.vehicule.get(1));
        Modele.magasin.get(1).addVehicules(Modele.vehicule.get(2));

    }
}