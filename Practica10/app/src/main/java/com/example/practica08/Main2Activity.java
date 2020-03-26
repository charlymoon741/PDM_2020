package com.example.practica08;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnVolver = findViewById(R.id.btnVolver);
        TextView txtResultado = findViewById(R.id.txtDatos);

        cPersona otro = (cPersona) getIntent().getExtras().getParcelable("usuario");

        String nombre = otro.getNombre();
        String mail = otro.getMail();
        String telefono = otro.getTelefono();
        int edad = otro.getEdad();

        txtResultado.setText(otro.getDatos());
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
