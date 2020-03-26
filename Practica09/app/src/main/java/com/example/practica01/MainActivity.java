package com.example.practica01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtResultado = (TextView)findViewById(R.id.txtResultado);
        final EditText edtNumero1 = (EditText)findViewById(R.id.edtNumero1);
        final EditText edtNumero2 = (EditText)findViewById(R.id.edtNumero2);

        Button btnSuma = findViewById(R.id.btnSuma);
        Button btnResta = findViewById(R.id.btnResta);
        Button btnMulti = findViewById(R.id.btnMulti);
        Button btnDiv = findViewById(R.id.btnDividir);

        // Evento para suma
        btnSuma.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Aritmetica ar = new Aritmetica();

                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(), "Introduzca ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }

                ar.setN1(Integer.parseInt(strnumero1));
                ar.setN2(Integer.parseInt(strnumero2));
                txtResultado.setText("Resultado : "+String.valueOf(ar.Suma()));

            }
        });

        // Evento para resta
        btnResta.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Aritmetica ar = new Aritmetica();

                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(), "Introduzca ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }

                ar.setN1(Integer.parseInt(strnumero1));
                ar.setN2(Integer.parseInt(strnumero2));
                txtResultado.setText("Resultado : "+String.valueOf(ar.Resta()));

            }
        });

        // Evento para multiplicación
        btnMulti.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Aritmetica ar = new Aritmetica();

                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(), "Introduzca ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }

                ar.setN1(Integer.parseInt(strnumero1));
                ar.setN2(Integer.parseInt(strnumero2));
                txtResultado.setText("Resultado : "+String.valueOf(ar.Multi()));

            }
        });

        // Evento para División
        btnDiv.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Aritmetica ar = new Aritmetica();

                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(), "Introduzca ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }

                ar.setN1(Integer.parseInt(strnumero1));
                ar.setN2(Integer.parseInt(strnumero2));
                txtResultado.setText("Resultado : "+String.valueOf(ar.Div()));

            }
        });

    }
}
