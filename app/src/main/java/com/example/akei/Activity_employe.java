package com.example.akei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity_employe extends AppCompatActivity {
    private ListView listViewEmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employe);
         listViewEmp = findViewById(R.id.listViewEmp);

        Bundle bundleRecu =this.getIntent().getExtras();

        final int numMagasin =bundleRecu.getInt("numMagasin");

        Magasin leMagasin= Modele.magasin.get(numMagasin);

        ArrayList<Employe> lesEmployes = leMagasin.getLesEmployes();

        ArrayAdapter<Employe> listeEmployes = new ArrayAdapter<Employe>(this,android.R.layout.simple_list_item_1 ,lesEmployes );


        listViewEmp.setAdapter(listeEmployes);
        listViewEmp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // arg0.getAdapter().getItem(arg2) designe l'objet Employe qui a été cliqué dans le listview

                int positionEmp = Modele.employes.indexOf(arg0.getAdapter().getItem(arg2));

                godetailEmploye(positionEmp);

            }

        });

    }

    public void godetailEmploye(int numE){
        Intent intent = new Intent(this, Activity_detailEmp.class);
        Bundle bundlele = new Bundle();
        bundlele.putInt("numEmploye",numE);
        intent.putExtras(bundlele);
        startActivity(intent);

    }

    }

