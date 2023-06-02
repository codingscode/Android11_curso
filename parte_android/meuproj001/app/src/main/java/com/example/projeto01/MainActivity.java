package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nome;
    Button ok;
    TextView resultado;
    String nomeusuario;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        nome = findViewById(R.id.textoeditavel);
        ok = findViewById(R.id.botao_ok);
        resultado = findViewById(R.id.textoresultado);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               nomeusuario = nome.getText().toString();
               resultado.setText(nomeusuario);
            }
        });
        
    }
}

