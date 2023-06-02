package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button ok;
    TextView resultado;
    ImageView imagem;
    RadioGroup radioGroup;
    RadioButton verde;
    RadioButton vermelho;
    RadioButton amarelo;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = findViewById(R.id.botao_ok);
        resultado = findViewById(R.id.textoresultado);
        imagem = findViewById(R.id.imagem);

        radioGroup = findViewById(R.id.grupo);
        verde = findViewById(R.id.rbverde);
        vermelho = findViewById(R.id.rbvermelho);
        amarelo = findViewById(R.id.rbamarelo);
        layout = findViewById(R.id.layout_linear);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (verde.isChecked()) {
                  layout.setBackgroundColor(Color.GREEN);
               }
               else if (vermelho.isChecked()) {
                  layout.setBackgroundColor(Color.RED);
               }
               else if(amarelo.isChecked()) {
                  layout.setBackgroundColor(Color.YELLOW);
               }
               
            }
        });

        
    }
}

