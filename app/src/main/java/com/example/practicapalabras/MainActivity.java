package com.example.practicapalabras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    int count;
    int cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        editText.addTextChangedListener(new TextWatcher() {

        String vocal[] = {"U", "u", "i", "I"};

           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               String text = editText.getText().toString();
               String[] textArray = text.split(" ");
               cantidad = editText.getText().toString().length();

               if (textArray.length==2) {
                   for (i = 0; i<cantidad; i++) {

                       if (text.equals(vocal[i])) {
                        count++;
                       }
                   }
                   textView.setText(count + " vocales cerradas");
               }
           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
        });
    }

}