package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
    public MediaPlayer mp;
    public Button playButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = (Button) findViewById(R.id.boton);
        musica_iniciar();
        contador();
        playButton.setVisibility(View.GONE);
    }

    public void musica_iniciar()
    {
        mp = MediaPlayer.create(this,R.raw.casino);
        mp.start();
    }

    public void musica_parar()
    {
        mp.stop();
    }

     public void contador()
     {
         new CountDownTimer(30000, 1000) {

             public void onTick(long millisUntilFinished) {
                 TextView texto_contador = (TextView) findViewById(R.id.contador);
                 texto_contador.setText(""+millisUntilFinished / 1000);

             }

             public void onFinish() {
                 TextView texto_contador = (TextView) findViewById(R.id.contador);
                 playButton.setVisibility(View.VISIBLE);
                 musica_parar();
             }
         }.start();

     }


    public void llamar(View vista) {
        Intent intent = new Intent(this,Pantalla_Inicial.class);
        startActivity(intent);
    }

}
