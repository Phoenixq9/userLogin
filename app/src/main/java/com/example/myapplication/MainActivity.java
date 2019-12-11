package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

  EditText InputAd,InputParola;
 Button send;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         InputAd=findViewById(R.id.editAd);
         InputParola=findViewById(R.id.editSifre);
         send=findViewById(R.id.buttonGonder);

    }
    public void BtnAct_Gonder(View view) {

        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("1",InputAd.getText().toString());
        intent.putExtra("2",InputParola.getText().toString());
        startActivity(intent);
        Toast.makeText(MainActivity.this,"kayıt alındı.",Toast.LENGTH_LONG).show();




    }



}
