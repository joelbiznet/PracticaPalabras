package com.example.practicapalabras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText txt_uno;
    private String[] vocales = {"U", "u", "i", "I"};

    private int palabraEncontrada = 0;
    private Button btn_contar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_contar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                for(String palabra: vocales){
                    if(palabra.equals(txt_uno.getText().toString())){
                        ++palabraEncontrada;
                        break; //Si encuentra coincidencia detiene la ejecución del for.
                    }
                }

                if(palabraEncontrada>1){ //se encontró una vocal.
                    Toast.makeText(MainActivity.this, palabraEncontrada + " vocales cerradas encontradas",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}