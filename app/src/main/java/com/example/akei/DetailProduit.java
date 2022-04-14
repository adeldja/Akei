package com.example.akei;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailProduit extends AppCompatActivity {
    TextView nomP;
    TextView desc;
    TextView lxLxhxp;
    TextView prix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_produit);
        nomP = findViewById(R.id.tv_nomP);
        desc = findViewById(R.id.tv_desc);
        lxLxhxp = findViewById(R.id.tv_lxLxhxp);
        prix = findViewById(R.id.tv_Prix);
        Bundle recu = this.getIntent().getExtras();
        int numPiece = recu.getInt("piece");
        int numProduit = recu.getInt("prod");
        Produit leProduit = Modele.piece.get(numPiece).getLesProduits().get(numProduit);
                nomP.setText("Nom du produit :  "+leProduit.getNomP());
                desc.setText("Description du produit :  "+leProduit.getDesc_tech());
                lxLxhxp.setText("Taille du produit (l * L * h) :  "+leProduit.getLongueur()+" x "+leProduit.getLargeur()+" x "+leProduit.getHauteur());
                prix.setText("Le prix du produit :  "+leProduit.getPrix()+" €");
    }
}