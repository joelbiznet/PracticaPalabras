package com.example.practicapalabras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public EditText txt_uno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.txt_uno).requestFocus();
        Button btn_contar = findViewById(R.id.btn_contar);
        btn_contar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cantidad = txt_uno.getText().toString();

                String[] temp = cantidad.split(" ");

                int cantidadNombres = temp.length;

                if (temp[0].equals(temp[1])) { // strText is the string from the edit text, myString is the string
                    Toast.makeText(this, "Las 2 palabras son iguales: ", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "Las 2 palabras no son iguales: ", Toast.LENGTH_LONG).show();
                }

                Toast.makeText(this, "La cantidad de palabras es: " + cantidadNombres, Toast.LENGTH_LONG).show();
            }

        }
    }

}