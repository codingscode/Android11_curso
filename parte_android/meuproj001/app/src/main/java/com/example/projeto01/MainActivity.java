package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button ok;
    TextView resultado;
    ImageView imagem;
    CheckBox masculino;
    CheckBox feminino;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        ok = findViewById(R.id.botao_ok);
        resultado = findViewById(R.id.textoresultado);
        imagem = findViewById(R.id.imagem);

        masculino = findViewById(R.id.masculino);
        feminino = findViewById(R.id.feminino);

        masculino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (masculino.isChecked()) {
                  resultado.setText("masculino");
                  feminino.setChecked(false);
               }
               else {
                  resultado.setText("qual seu gênero?");
               }
            }
        });
        
        feminino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (feminino.isChecked()) {
                  resultado.setText("feminino");
                  masculino.setChecked(false);
               }
               else {
                  resultado.setText("qual seu gênero?");
               }
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               imagem.setImageResource(R.drawable.vegeta);
               
            }
        });

        

        
    }
}

