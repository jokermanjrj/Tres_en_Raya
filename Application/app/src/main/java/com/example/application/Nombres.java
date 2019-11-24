package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Nombres extends AppCompatActivity {

    public String nm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombres);


    }

    public void aJugar(View vista)
    {
       /* EditText et =(EditText) findViewById(R.id.nombre);
        nm = et.getText().toString();*/


        Intent intent = new Intent(this,Juego.class);
        startActivity(intent);

    }

}
