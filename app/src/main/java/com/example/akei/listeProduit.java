package com.example.akei;
import android.support.v4.os.*;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class listeProduit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_produit);
        Bundle recu = this.getIntent().getExtras();
         final int numPiece = recu.getInt("numPiece");
        ListView listView = findViewById(R.id.ll_listProduit);
        //recup la piece
        Piece laPiece = Modele.piece.get(numPiece);
        ArrayList<Produit> lesProduits = laPiece.getLesProduits();
        ArrayAdapter<Produit> listeProduit = new ArrayAdapter<Produit>(this,android.R.layout.simple_list_item_1 ,lesProduits );
        listView.setAdapter(listeProduit);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                goDetail(arg2,numPiece);
            }
        });
    }
    public void goDetail(int p ,int pi){
        Intent intent = new Intent(this, DetailProduit.class);
        Bundle lebundle = new Bundle();
        lebundle.putInt("prod",p);
        lebundle.putInt("piece",pi);
        intent.putExtras(lebundle);
        startActivity(intent);
    }
}