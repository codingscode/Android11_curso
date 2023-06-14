package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    private TextView ultimo, direito, dica;
    private Button confirmar;
    private EditText textoadivinhar;

    boolean doisDig, tresDig, quatroDig;
    
    Random r = new Random();
    int aleatorio;
    int restanteDireito = 10;
    
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ultimo = findViewById(R.id.textoultimo);
        direito = findViewById(R.id.textodireito);
        dica = findViewById(R.id.textodica);
        confirmar = findViewById(R.id.botaoconfirmar);
        textoadivinhar = findViewById(R.id.textoAdiv);

        doisDig = getIntent().getBooleanExtra("dois", false);
        tresDig = getIntent().getBooleanExtra("tres", false);
        quatroDig = getIntent().getBooleanExtra("quatro", false);
        
        if (doisDig) {
           aleatorio = r.nextInt(90) + 10;
        }
        if (tresDig) {
           aleatorio = r.nextInt(900) + 100;
        }
        if (quatroDig) {
           aleatorio = r.nextInt(9000) + 1000;
        }

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String adivinhar = textoadivinhar.getText().toString();
               if (adivinhar.equals("")) {
                  Toast.makeText(GameActivity.this, "tente uma adivinhação", Toast.LENGTH_LONG).show();
                  
               }
               else {
                  ultimo.setVisibility(View.VISIBLE);
                  direito.setVisibility(View.VISIBLE);
                  dica.setVisibility(View.VISIBLE);
                  
                  restanteDireito--;
                  int adivUsuario = Integer.parseInt(adivinhar);
                  
                  ultimo.setText(adivinhar);
                  direito.setText(restanteDireito);
                  
                  if (aleatorio == adivUsuario) {
                  
                  }
                  if (aleatorio < adivUsuario) {
                     dica.setText("Diminua o valor");
                  }
                  if (aleatorio > adivUsuario) {
                     dica.setText("Aumente o valor");
                  }
                  if (restanteDireito == 0) {
                  
                  }
                  
                  textoadivinhar.setText("");
                  
               }
            }
        });

        



    }
}
