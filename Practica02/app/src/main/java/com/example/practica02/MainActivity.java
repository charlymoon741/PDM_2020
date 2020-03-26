package com.example.practica02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox pizza, cafe, hamburguesa;
    Button btnOrden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick(){
        pizza = findViewById(R.id.chkPizza);
        cafe = findViewById(R.id.chkCafe);
        hamburguesa = findViewById(R.id.chkHamburguesa);
        btnOrden = (Button)findViewById(R.id.btnOrdenar);

        // Evento click
        btnOrden.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                int total = 0;
                StringBuilder result = new StringBuilder();
                result.append("Productos seleccionados");

                if(pizza.isChecked()){
                    result.append("\nPizza $50");
                    total+=50;
                }
                if(cafe.isChecked()){
                    result.append("\nCafe $25");
                    total+=25;
                }
                if(hamburguesa.isChecked()){
                    result.append("\nHamburguesa $45");
                    total+=45;
                }
                result.append("\nTotal: "+total+" pesos");
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
