package com.example.fasesdesconfinamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class menuusuario extends AppCompatActivity {

    private Spinner spinner0;

    public menuusuario() {
    }

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.menuusuario );

        spinner0 = (Spinner) findViewById( R.id.spinner0 );

        String[] provincias = {"PROVINCIAS GALLEGAS", "Coruna", "Lugo", "Orense", "Pontevedra"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_spinner_item, provincias );
        spinner0.setAdapter( adapter );


        verfase();
        pulsarsalir();
        // LLamo a las funciones para realizar la accion del boton.




    }

    public void verfase() {
        Button selec_provincia = (Button) findViewById( R.id.button4 );
        selec_provincia.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick( View view ) {
                String selec = spinner0.getSelectedItem().toString();

                if (selec.equals( "Coruna" )) {

                    change_activity0();

                } else if (selec.equals( "Lugo" )) {

                    change_activity1();

                } else if (selec.equals( "Orense" )) {

                    change_activity2();

                } else if (selec.equals( "Pontevedra" )) {

                    change_activity3();

                }


            }

        } );

    }



        public void change_activity0 () {
            Intent myIntent = new Intent( getApplicationContext(), coruna.class );
            startActivity( myIntent ); // Cambio de aplicación
        }


        public void change_activity1 () {
            Intent myIntent = new Intent( getApplicationContext(), lugo.class );
            startActivity( myIntent ); // Cambio de aplicación
        }


        public void change_activity2 () {
            Intent myIntent = new Intent( getApplicationContext(), orense.class );
            startActivity( myIntent ); // Cambio de aplicación
        }


        public void change_activity3 () {
            Intent myIntent = new Intent( getApplicationContext(), pontevedra.class );
            startActivity( myIntent ); // Cambio de aplicación
        }


        public void pulsarsalir () {

            Button pulsar_salir = (Button) findViewById( R.id.button5 );
            pulsar_salir.setOnClickListener( new View.OnClickListener() {

                                                 @Override
                                                 public void onClick( View view ) {
                                                     change_activity4();
                                                 }
                                             }
            );
        }
        public void change_activity4 () {
            Intent myIntent = new Intent( getApplicationContext(), MainActivity.class );
            startActivity( myIntent ); // Cambio de aplicación
        }


    }


