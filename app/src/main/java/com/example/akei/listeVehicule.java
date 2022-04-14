package com.example.akei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class listeVehicule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_vehicule);

        ListView listViewMag = (ListView) findViewById(R.id.listViewMag);

        ArrayList<Magasin> lesMagasins = new ArrayList<>();
        for (int i = 0; i < Modele.magasin.size(); i++) {
            lesMagasins.add(Modele.magasin.get(i));
        }

        ArrayAdapter<Magasin> lst_magasins = new ArrayAdapter<Magasin>(this, android.R.layout.simple_list_item_1, lesMagasins);
        listViewMag.setAdapter(lst_magasins);


        //permet d'ouvrir la page de véhicules en location en cliquant
        listViewMag.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                goVehicule(arg2);
            }
        });


        }

        public void goVehicule(int numMag){
            Intent intent = new Intent(this, Activity_vehicule.class);
            Bundle lebundle = new Bundle();
            lebundle.putInt("numMag",numMag);
            intent.putExtras(lebundle);
            startActivity(intent);
        }

}
