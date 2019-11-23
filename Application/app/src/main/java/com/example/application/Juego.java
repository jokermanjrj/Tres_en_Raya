package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Juego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        //Iniciamos el array casillas que identifica cada casilla y la almacena en el array
        CASILLAS = new int[9];

        CASILLAS[0] = R.id.a1;
        CASILLAS[1] = R.id.a2;
        CASILLAS[2] = R.id.a3;
        CASILLAS[3] = R.id.b1;
        CASILLAS[4] = R.id.b2;
        CASILLAS[5] = R.id.b3;
        CASILLAS[6] = R.id.c1;
        CASILLAS[7] = R.id.c2;
        CASILLAS[8] = R.id.c3;

    }

    private int[] CASILLAS;
    Partida partida;






    public void toque(View mivista)
    {
        ImageView imagen;
        //Bucle que pondra la imagen casilla (la casilla vacia) en todas las casillas al iniciar
        //para siempre empiecen todas las casillas en blanco
        for(int cadaCasilla:CASILLAS)
        {
            imagen=(ImageView)findViewById((cadaCasilla));
            imagen.setImageResource(R.drawable.casilla);
        }
        //Declaramos la variable jugadores en 1 por defecto para que si pulsamos 1 jugador no ca
        //mbie nada y si pulsamos dos jugadores entre en el if y la cambie a dos
        int casilla = 0;

        for (int i=0;i<9;i++)
        {
            if(CASILLAS[i]==mivista.getId())
            {
                casilla=i;
                break;
            }
        }

        Toast toast = Toast.makeText(this,"Has pulsado la casilla "+casilla, Toast.LENGTH_LONG);

        toast.setGravity(Gravity.CENTER,0,0);

        toast.show();
    }

    private void marca(int casilla) {

        ImageView imagen;


    }
}
