package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {


 EditText kullaniciAdi,parola,ad,soyad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        kullaniciAdi=findViewById(R.id.editKullaniciAdi);
        parola=findViewById(R.id.editSifre);
        ad=findViewById(R.id.editAd);
        soyad=findViewById(R.id.editSoyad);

        ad.setText("Elif");
        soyad.setText("Okatan");


         Intent intent=getIntent();
         String kAdi=intent.getStringExtra( "1");
         String kPar=intent.getStringExtra( "2");

        kullaniciAdi.setText(kAdi);
        parola.setText(kPar);

    }
}
