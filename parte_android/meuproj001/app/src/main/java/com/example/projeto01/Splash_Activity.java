package com.example.projeto01;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Splash_Activity extends AppCompatActivity {


    private ImageView imagem;
    private TextView texto3;
    Animation imagemAnimacao, textoAnimacao;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        texto3 = findViewById(R.id.texto3);
        imagem = findViewById(R.id.imagem);

        imagemAnimacao = AnimationUtils.loadAnimation(this, R.anim.imagem_animacao);
        textoAnimacao = AnimationUtils.loadAnimation(this, R.anim.texto_animacao);

        imagem.setAnimation(imagemAnimacao);
        texto3.setAnimation(textoAnimacao);

        new CountDownTimer(5000, 1000) {

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
               startActivity(new Intent(Splash_Activity.this, MainActivity.class));
               finish();
            }
        }.start();
    }

}
