package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private TextView ultimo, direito, dica;
    private Button confirmar;
    private EditText adivinhar;

    boolean doisDig, tresDig, quatroDig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ultimo = findViewById(R.id.textoultimo);
        direito = findViewById(R.id.textodireito);
        dica = findViewById(R.id.textodica);
        confirmar = findViewById(R.id.botaoconfirmar);
        adivinhar = findViewById(R.id.textoAdiv);

        doisDig = getIntent().getBooleanExtra("dois", false);
        tresDig = getIntent().getBooleanExtra("tres", false);
        quatroDig = getIntent().getBooleanExtra("quatro", false);
        



    }
}
