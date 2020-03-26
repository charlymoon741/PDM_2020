package com.example.practica03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioButton generoRadio;
    RadioGroup radioGrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGrupo = (RadioGroup)findViewById(R.id.radioGroup);
    }

    public void onClickButtonMethod(View v){
        int selectedId = radioGrupo.getCheckedRadioButtonId();
        generoRadio = (RadioButton)findViewById(selectedId);

        if(selectedId == -1){
            Toast.makeText(MainActivity.this,"Nada seleccionado", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this,generoRadio.getText(), Toast.LENGTH_LONG).show();
        }
    }
}
