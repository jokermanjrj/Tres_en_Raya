package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Juego extends AppCompatActivity {

    Partida partida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        Nombres nombres = null;
        /*TextView tx = (TextView) findViewById(R.id.jg);
        tx.setText(nombres.nm);*/


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
         partida = new Partida();
        ImageView imagen;
        //Bucle que pondra la imagen casilla (la casilla vacia) en todas las casillas al iniciar
        //para siempre empiecen todas las casillas en blanco
        for(int cadaCasilla:CASILLAS)
        {
            imagen=(ImageView)findViewById((cadaCasilla));
            imagen.setImageResource(R.drawable.casilla);
        }

    }

    private int[] CASILLAS;



    public void toque(View mivista)
    {
        int casilla = 0;

        for (int i=0;i<9;i++)
        {
            if(CASILLAS[i]==mivista.getId())
            {
                casilla=i;
                break;
            }
        }

        if(partida.comprueba_casilla(casilla)==false)
        {
            return;
        }

        marca(casilla);


        int resultado = partida.turno();

        if (resultado>0){

            termina(resultado);

            aJugar();





        }

        casilla=partida.ia();


        while(partida.comprueba_casilla(casilla) != true){

            casilla=partida.ia();

        }


        marca(casilla);

        resultado=partida.turno();

        if (resultado>0) {

            termina(resultado);
            aJugar();
        }

    }

    private void termina(int resultado)
    {
            String mensaje;

            if (resultado==1)mensaje="Gana jugador 1 (Nombre de jugador)";
            else if(resultado==2) mensaje="Gana la IA";
            else mensaje="Empate Titan";

            Toast toast = Toast.makeText(this,mensaje,Toast.LENGTH_LONG);

            toast.setGravity(Gravity.CENTER,0,0);

            toast.show();
    }



    private void marca(int casilla) {

        ImageView imagen;

        imagen=(ImageView)findViewById(CASILLAS[casilla]);

        if(partida.jugador==1){

            imagen.setImageResource(R.drawable.circulo);
        }
        else {

            imagen.setImageResource(R.drawable.aspa);
        }


    }


    public void aJugar()
    {

        Intent intent = new Intent(this,Nombres.class);
        startActivity(intent);

    }


}
