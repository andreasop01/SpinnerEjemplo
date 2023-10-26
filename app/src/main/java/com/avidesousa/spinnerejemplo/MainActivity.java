package com.avidesousa.spinnerejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String misalumnos[]=new String[]{"Elia","Rodrigo","Sergio","Marcos","Alvaro","Pedro","Pepe"};
        Spinner miSpinner=findViewById(R.id.miSpinner);
        ArrayAdapter<String> miAdaptador=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,misalumnos);
        miAdaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        miSpinner.setAdapter(miAdaptador);

        miSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String nombre=misalumnos[position];

                if(nombre.startsWith("P")){

                    Toast.makeText(getApplicationContext(),"10", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"0", Toast.LENGTH_LONG).show();
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}