package com.example.projeto01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button ok;
    TextView resultado;
    ImageView imagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = findViewById(R.id.botao_ok);
        resultado = findViewById(R.id.textoresultado);
        imagem = findViewById(R.id.imagem);
        
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(getApplicationContext(), "Isto é uma mensagem torta", Toast.LENGTH_LONG).show();
            }
        });



    }
}

// ctrl + alt + o
