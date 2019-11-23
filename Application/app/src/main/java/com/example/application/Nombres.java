package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Nombres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombres);

    }

    private int jugadores;


    public void unJug(View view) {
        Intent intent = new Intent(this,Juego.class);
        startActivity(intent);
    }


    // Partida partida;

    //Declaramos el metodo que llamamos al pusar 1 o dos jugadores
    public void aJugar(View vista)
    {
        aJugar(vista,jugadores);
        jugadores=1;



        if(vista.getId()==R.id.dosjug) {
            jugadores=2;
        }

        //Declaramos el grupo de botones de dificultad
        RadioGroup configDificultad=(RadioGroup)findViewById(R.id.dificultad);
        //En la variable id nos devolvera el valor numerico del id de la dificultad seleccionada
        //de forma que si elegimos facil devolvera 1, normal 2 e imposible 3
        int id = configDificultad.getCheckedRadioButtonId();

        int dificultad = 0;

        ((Button)findViewById(R.id.unjug)).setEnabled(false);

        ((RadioGroup)findViewById(R.id.dificultad)).setAlpha(0);

        ((Button)findViewById(R.id.dosjug)).setEnabled(false);


    }




}
