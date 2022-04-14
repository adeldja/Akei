package com.example.akei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity_vehicule extends AppCompatActivity {
    int numMag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicule);

        ListView listViewVeh = findViewById(R.id.listViewVeh);
        Bundle bundleRecu = this.getIntent().getExtras();
        numMag = bundleRecu.getInt("numMag");
        Log.d("test",numMag+"  = num magasin");
        Magasin leMagasin = Modele.magasin.get(numMag);
        Log.d("test",leMagasin.getVille()+"  = ville magasin");
        ArrayList<Vehicule> lesVehicules = leMagasin.getLesVehicules();

        ArrayAdapter<Vehicule> lst_vehicules = new ArrayAdapter<Vehicule>(this, android.R.layout.simple_list_item_1, lesVehicules);
        listViewVeh.setAdapter(lst_vehicules);



        listViewVeh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                goCaracteristiques(arg2);
                Log.d("test", arg2+"");
            }
        });

    }

    public void goCaracteristiques(int numV){
        Intent intent = new Intent(this, Activity_caracteristiques.class);
        Bundle lebundle = new Bundle();
        Log.d("test", numV+"");
        lebundle.putInt("numVeh",numV);
        lebundle.putInt("numMag",numMag);
        intent.putExtras(lebundle);
        startActivity(intent);
    }
}