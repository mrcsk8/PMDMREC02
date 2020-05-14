package com.example.fasesdesconfinamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class seleccionarFase extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;


    public seleccionarFase() {
    }

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_seleccionar_fase );

        spinner1 = (Spinner) findViewById( R.id.spinnerprov );
        spinner2 = (Spinner) findViewById( R.id.spinnerfas );

        String[] spinnerprovincias = {"PROVINCIAS GALLEGAS", "Coruna", "Lugo", "Orense", "Pontevedra"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_spinner_item, spinnerprovincias );
        spinner1.setAdapter( adapter );

        String[] spinnerfases = {"FASES", "0", "1", "2", "3"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>( this, android.R.layout.simple_spinner_item, spinnerfases );
        spinner2.setAdapter( adapter2 );

    }


}


