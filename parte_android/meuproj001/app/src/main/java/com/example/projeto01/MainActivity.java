package com.example.projeto01;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button ok;
    TextView resultado;
    ImageView imagem;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = findViewById(R.id.botao_ok);
        resultado = findViewById(R.id.textoresultado);
        imagem = findViewById(R.id.imagem);
        
        layout = findViewById(R.id.layout_linear);
        
        
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mostrarMensagemDialog();
            }
        });

    // testar também com LENGTH_SHORT
    }

    private void mostrarMensagemDialog() {
       AlertDialog.Builder dialogAlerta = new AlertDialog.Builder(this);
       dialogAlerta.setTitle("deletar")
               .setMessage("Você quer deletar este texto?")
               .setNegativeButton("não", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {
                     dialogInterface.cancel();
                  }
               })
               .setPositiveButton("sim", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                      resultado.setText("");
                   }
               }).show();
        dialogAlerta.create();
    }
}

// ctrl + alt + o
