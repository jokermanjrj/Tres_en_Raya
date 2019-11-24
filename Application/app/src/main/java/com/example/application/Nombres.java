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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombres);
        EditText et =(EditText) findViewById(R.id.nombre);
        String nm = et.getText().toString();

    }

    public String nm;

    public void aJugar(View vista)
    {


        Intent intent = new Intent(this,Juego.class);
        startActivity(intent);

    }

}
