package com.example.akei;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_detailEmp extends AppCompatActivity {
        public TextView tv_nomEmp;
        public TextView tv_prenomEmp;
        public TextView tv_tel;
        public TextView tv_mail;
        public TextView tv_laPiece;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_emp);
        tv_nomEmp=findViewById(R.id.tv_nomEmp);
        tv_prenomEmp=findViewById(R.id.tv_prenomEmp);
        tv_tel=findViewById(R.id.tv_tel);
        tv_mail=findViewById(R.id.tv_mail);
        tv_laPiece=findViewById(R.id.tv_laPiece);
        Bundle bundleRecu =this.getIntent().getExtras();

        int numEmploye =bundleRecu.getInt("numEmploye");
                Employe leEmploye= Modele.employes.get(numEmploye);

                tv_nomEmp.setText("Nom :"+leEmploye.getNom());
                tv_prenomEmp.setText("Prénom :"+leEmploye.getPrenom());
                tv_tel.setText("Téléphone :"+leEmploye.getTel());
                tv_mail.setText("Mail :"+leEmploye.getMail());
                tv_laPiece.setText("Pièce :"+leEmploye.getLaPiece().getLibellePiece());


    }
}