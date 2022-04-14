package com.example.akei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_caracteristiques extends AppCompatActivity {
    public TextView TV_marque;
    public TextView TV_modele;
    public TextView TV_cubage;
    public TextView TV_longueur;
    public TextView TV_largeur;
    public TextView TV_hauteur;
    public TextView TV_immat;
    public TextView TV_typeCarburant;
    public TextView TV_nbKms;
    public TextView TV_typeVeh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caracteristiques);

        TV_marque = findViewById(R.id.TV_marque);
        TV_modele = findViewById(R.id.TV_modele);
        TV_cubage = findViewById(R.id.TV_cubage);
        TV_longueur = findViewById(R.id.TV_longueur);
        TV_largeur = findViewById(R.id.TV_largeur);
        TV_hauteur = findViewById(R.id.TV_hauteur);
        TV_immat = findViewById(R.id.TV_immat);
        TV_typeCarburant = findViewById(R.id.TV_typeCarburant);
        TV_nbKms = findViewById(R.id.TV_nbKms);
        TV_typeVeh = findViewById(R.id.TV_typeVeh);

        Bundle bundleRecu = this.getIntent().getExtras();
        int numVeh = bundleRecu.getInt("numVeh");
        int numMag = bundleRecu.getInt("numMag");
        Vehicule leVehicule = Modele.magasin.get(numMag).getLesVehicules().get(numVeh);

        TV_marque.setText("Marque : " + leVehicule.getMarque());
        TV_modele.setText("Modele : " + leVehicule.getModele());
        TV_cubage.setText("Cubage : " + leVehicule.getCubage());
        TV_longueur.setText("Longueur : " + leVehicule.getLongueur());
        TV_largeur.setText("Largeur : " + leVehicule.getLargeur());
        TV_hauteur.setText("Hauteur : " + leVehicule.getHauteur());
        TV_immat.setText("Immatriculation : " + leVehicule.getImmatriculation());
        TV_typeCarburant.setText("Type de carburant : " + leVehicule.getTypeCarburant());
        TV_nbKms.setText("Nombre de Kilomètres : " + leVehicule.getNbKms());
        TV_typeVeh.setText("Type de véhicule : " + leVehicule.getTypeVehicule());
    }
}