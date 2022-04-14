package com.example.akei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class listePiece extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_rayon);

        ListView listView = findViewById(R.id.ll_listRayon);
        ArrayList<Piece> lesPieces = new ArrayList<Piece>();
        for(int i = 0; i < Modele.piece.size(); i++){
            lesPieces.add(Modele.piece.get(i));
        }
        ArrayAdapter<Piece> listePieces = new ArrayAdapter<Piece>(this,android.R.layout.simple_list_item_1 ,lesPieces );
        listView.setAdapter(listePieces);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                goProduit(arg2);
                }

            });
    }

    public void goProduit(int numP){
        Intent intent = new Intent(this, listeProduit.class);
        Bundle lebundle = new Bundle();
        lebundle.putInt("numPiece",numP);
        intent.putExtras(lebundle);
        startActivity(intent);
    }
}