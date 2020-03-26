package com.example.practica08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public cPersona usuario = new cPersona();
    String nombre;
    String email;
    String telefono;
    int edad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar);
        Button btnLimpiar = findViewById(R.id.btnLimpiar);

        final EditText edtNombre = findViewById(R.id.edtNombre);
        final EditText edtEmail = findViewById(R.id.edtEmail);
        final EditText edtEdad = findViewById(R.id.edtEdad);
        final EditText edtTelefono = findViewById(R.id.edtTelefono);
        final TextView txtResultado = findViewById(R.id.txtResultado);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre = edtNombre.getText().toString();
                email = edtEmail.getText().toString();
                telefono = edtTelefono.getText().toString();
                edad = Integer.parseInt(edtEdad.getText().toString());

                usuario.setEdad(edad);
                usuario.setMail(email);
                usuario.setNombre(nombre);
                usuario.setTelefono(telefono);

                txtResultado.setText(usuario.getDatos());
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("usuario", usuario);
                startActivity(intent);
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtEmail.setText("");
                edtNombre.setText("");
                edtEdad.setText("0");
                edtTelefono.setText("");

                edad = 0;
                nombre = "";
                email = "";
                telefono = "";
                edtNombre.requestFocus();
            }
        });
    }
}