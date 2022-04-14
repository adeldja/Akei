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

import static com.example.akei.Modele.initDonnees;

public class listeMagasin extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_magasin);
        listView = findViewById(R.id.listView);
        ArrayList<Magasin> lesMagasins = new ArrayList<>();
        for(int i = 0; i < Modele.magasin.size(); i++){
            lesMagasins.add(Modele.magasin.get(i));

        }
        ArrayAdapter<Magasin> listeMagasin= new ArrayAdapter<Magasin>(this,android.R.layout.simple_list_item_1 ,lesMagasins );


        listView.setAdapter(listeMagasin);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                goEmploye(arg2);
            }

        });


    }

    public void goEmploye(int numM){
        Intent intent = new Intent(this, Activity_employe.class);
        Bundle lebundle = new Bundle();
        lebundle.putInt("numMagasin",numM);
        intent.putExtras(lebundle);
        startActivity(intent);

    }
}

