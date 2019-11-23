package com.example.project;

import android.widget.ImageView;

import java.util.Random;

public class Partida {
    public Partida(int dificultad)
    {
        this.dificultad=dificultad;

        jugador=1;
    }


    public void turno() {

        jugador++;

        if(jugador>2) {

            jugador=1;

        }
    }


    public int ia() {

        int casilla;

        Random casilla_azar = new Random();

        casilla=casilla_azar.nextInt(9);

        return casilla;
    }

    public final int dificultad;

    private int[] CASILLAS;

    public int jugador;


}
