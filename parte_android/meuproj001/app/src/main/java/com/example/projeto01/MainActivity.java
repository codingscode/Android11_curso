package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        texto = findViewById(R.id.textoid1);
        
        texto.setTextColor(Color.BLACK);
        
        texto.setText("outro texto setado");
        
        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               texto.setTextColor(Color.CYAN);
               texto.setBackgroundColor(Color.BLACK);
            }
        });
        
        
    }
}
