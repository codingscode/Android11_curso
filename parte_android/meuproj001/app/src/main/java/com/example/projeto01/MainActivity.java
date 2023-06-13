package com.example.projeto01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {


    private Button botaoiniciar;
    private RadioButton radio1, radio2, radio3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoiniciar = findViewById(R.id.botaoiniciar);
        radio1 = findViewById(R.id.rb1);
        radio2 = findViewById(R.id.rb2);
        radio3 = findViewById(R.id.rb3);

        botaoiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, GameActivity.class);
               
               if (!radio1.isChecked() && !radio2.isChecked() && !radio3.isChecked()) {
                   Snackbar.make(view, "Selecione um número de digitos", Snackbar.LENGTH_LONG).show();
               }
               else {
                  if (radio1.isChecked()) {
                     intent.putExtra("dois", true);
                  }
                  if (radio2.isChecked()) {
                     intent.putExtra("três", true);
                  }
                  if (radio3.isChecked()) {
                     intent.putExtra("quatro", true);
                  }
                  startActivity(intent);
               }
            }
        });
        


    }
}

// ctrl + alt + o
