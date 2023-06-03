package com.example.projeto01;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button ok;
    TextView resultado;
    ImageView imagem;
    Spinner spinner;
    
    ArrayAdapter adaptador;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = findViewById(R.id.botao_ok);
        resultado = findViewById(R.id.textoresultado);
        imagem = findViewById(R.id.imagem);
        spinner = findViewById(R.id.paisSpinner);
        
        adaptador = ArrayAdapter.createFromResource(this, R.array.paises, android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adaptador);
        
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            //public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               String pais = parent.getItemAtPosition(position).toString();
               resultado.setText(pais);
            }

            @Override
            //public void onNothingSelected(AdapterView<?> adapterView) {
            public void onNothingSelected(AdapterView<?> parent) {
               
            }
        });
        
        
        
    }
}

// ctrl + alt + o
