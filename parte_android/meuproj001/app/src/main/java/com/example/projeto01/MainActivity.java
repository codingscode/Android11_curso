package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button ok;
    TextView resultado;
    ImageView imagem;
    ToggleButton toggle;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = findViewById(R.id.botao_ok);
        resultado = findViewById(R.id.textoresultado);
        imagem = findViewById(R.id.imagem);
        toggle = findViewById(R.id.toggleMostrar);
        
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            //public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if (isChecked) {
                  imagem.setVisibility(View.INVISIBLE);
                  resultado.setText("Imagem está escondida");
               }
               else {
                  imagem.setVisibility(View.VISIBLE);
                  resultado.setText("Imagem está mostrada");
               }
            }
        });

        
    }
}

