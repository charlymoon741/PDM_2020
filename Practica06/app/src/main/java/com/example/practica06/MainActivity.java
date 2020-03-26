package com.example.practica06;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends Activity {
    ListView list;
    String[] maintitle = {
            "Titulo 1", "Titulo 2",
            "Titulo 3", "Titulo 4",
            "Titulo 5",
    };
    String[] subtitle = {
            "Sub Titulo 1", "Sub Titulo 2",
            "Sub Titulo 3", "Sub Titulo 4",
            "Sub Titulo 5",
    };
    Integer[] imgid = {
            R.drawable.logo1, R.drawable.logo2,
            R.drawable.logo3, R.drawable.logo4,
            R.drawable.logo5,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miListaAdapter adapter = new miListaAdapter(this, maintitle, subtitle,imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int
                    position, long id) {
// TODO Auto-generated method stub
                if (position == 0) {
//code specific to first list item

                    Toast.makeText(getApplicationContext(), "Primera",

                            Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
//code specific to 2nd list item

                    Toast.makeText(getApplicationContext(), "Segunda",

                            Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(getApplicationContext(), "Tercera",
                            Toast.LENGTH_SHORT).show();
                } else if (position == 3) {
                    Toast.makeText(getApplicationContext(), "Cuarta",
                            Toast.LENGTH_SHORT).show();
                } else if (position == 4) {
                    Toast.makeText(getApplicationContext(), "Quinta",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}