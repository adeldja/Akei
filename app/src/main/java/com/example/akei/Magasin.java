package com.example.akei;

import java.util.ArrayList;

public class Magasin {
    private  ArrayList<Vehicule> lesVehicules = new ArrayList<Vehicule>();
    private  ArrayList<Employe> lesEmployes = new ArrayList<Employe>();
    private String ville;

    public Magasin(String ville) {
        this.ville = ville;
    }

    public void addVehicules(Vehicule leVehicule){ lesVehicules.add(leVehicule); }

    public  void addEmploye(Employe leEmployer){
        lesEmployes.add(leEmployer);
    }

    public  ArrayList<Vehicule> getLesVehicules() {
        return lesVehicules;
    }

    public  void setLesVehicules(ArrayList<Vehicule> lesVehicules) {
        lesVehicules = lesVehicules;
    }

    public ArrayList<Employe> getLesEmployes() {
        return lesEmployes;
    }

    public  void setLesEmployes(ArrayList<Employe> lesEmployes) {
        lesEmployes = lesEmployes;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return  ville ;
    }
}