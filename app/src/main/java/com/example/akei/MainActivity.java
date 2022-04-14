package com.example.akei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public Button adel;
public Button mokos;
public Button PE;
public TextView b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Modele.initDonnees();
        adel = findViewById(R.id.b_ad);
        mokos = findViewById(R.id.b_moko);
        PE = findViewById(R.id.b_pe);
        b = findViewById(R.id.tv_bie);

        b.setText("BIENVENUE !");

        adel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                projetAdel();
            }

        });
        mokos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                projetMokos();
            }

        });
        PE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                projetPE();
            }

        });

    }
    public void projetAdel(){
        Intent intent = new Intent(this, listePiece.class);
        startActivity(intent);
    }
    public void projetMokos(){
        Intent intent = new Intent(this, listeMagasin.class);
        Log.d("test", "ici" );
        startActivity(intent);
    }
    public void projetPE(){
        Intent intent = new Intent(this, listeVehicule.class);
        Log.d("test", "ici" );
        startActivity(intent);
    }


}