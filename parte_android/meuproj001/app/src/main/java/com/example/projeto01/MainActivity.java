package com.example.projeto01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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
               Snackbar.make(layout, "Isto é uma mensagem Snackbar", Snackbar.LENGTH_INDEFINITE).setAction("fechar", new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {

                   }
               }).show();
            }
        });


    }
}

// ctrl + alt + o
