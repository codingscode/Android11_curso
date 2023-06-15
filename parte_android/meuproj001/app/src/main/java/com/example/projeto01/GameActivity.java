package com.example.projeto01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends AppCompatActivity {

    private TextView ultimo, direito, dica;
    private Button confirmar;
    private EditText textoadivinhar;

    boolean doisDig, tresDig, quatroDig;
    
    Random r = new Random();
    int aleatorio;
    int restanteDireito = 10;
    
    ArrayList<Integer> listaAdiv = new ArrayList<>();
    int tentativasUsu = 0;
    

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
                  
                  tentativasUsu++;
                  restanteDireito--;
                  
                  
                  int adivUsuario = Integer.parseInt(adivinhar);
                  listaAdiv.add(adivUsuario);
                  
                  ultimo.setText(adivinhar);
                  direito.setText(restanteDireito);
                  
                  if (aleatorio == adivUsuario) {
                     AlertDialog.Builder construtor = new AlertDialog.Builder(GameActivity.this);
                     construtor.setTitle("Jogo de adivinhar número");
                     construtor.setCancelable(false);
                     construtor.setMessage("Parabéns. Minha adivinhação foi " + aleatorio + "\n\nVocê descobriu meu número em " + tentativasUsu + " tentativas.\n\nSuas adivinhações: " + listaAdiv + "\n\nGostaria de jogas de novo?");
                     construtor.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                         @Override
                         //public void onClick(DialogInterface dialogInterface, int i) {
                         public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(GameActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                         }
                     });
                     construtor.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                         @Override
                         //public void onClick(DialogInterface dialogInterface, int i) {
                         public void onClick(DialogInterface dialog, int which) {
                            moveTaskToBack(true);
                            android.os.Process.killProcess(android.os.Process.myPid());
                            System.exit(1);
                         }
                     });
                     construtor.create().show();
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
