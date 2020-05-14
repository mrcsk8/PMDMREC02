package com.example.fasesdesconfinamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuadmin extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_menuadmin );

        pulsarAnadirFase();
        pulsarSeleccionarFase();
    }

    public void pulsarAnadirFase () {

            Button pulsar_salir = (Button) findViewById( R.id.button6 );
            pulsar_salir.setOnClickListener( new View.OnClickListener() {

                @Override
                public void onClick( View view ) {
                    change_activity6();
                }
            }
            );
        }
        public void change_activity6 () {
            Intent myIntent = new Intent( getApplicationContext(), anadirFase.class );
            startActivity( myIntent ); // Cambio de activity
        }



    public void pulsarSeleccionarFase () {

        Button pulsar_salir = (Button) findViewById( R.id.button7 );
        pulsar_salir.setOnClickListener( new View.OnClickListener() {

                                             @Override
                                             public void onClick( View view ) {
                                                 change_activity7();
                                             }
                                         }
        );
    }
    public void change_activity7 () {
        Intent myIntent = new Intent( getApplicationContext(), seleccionarFase.class );
        startActivity( myIntent ); // Cambio de activity
    }

}
