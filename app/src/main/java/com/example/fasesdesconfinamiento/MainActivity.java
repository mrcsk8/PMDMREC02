package com.example.fasesdesconfinamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.fasesdesconfinamiento.MESSAGE";
    public boolean log_success = false; // Indica que el user y pass son correctos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login(); // LLamo a la funcion para el logueo del usuario.
        loginadmin(); // LLamo a la funcion para el logueo del administrador.
    }







    public void login() {

        Button Login_user = (Button) findViewById(R.id.botonusuario);
        Login_user.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText user=(EditText) findViewById(R.id.textonombre);
                String usuario = user.getText().toString();
                EditText pass=(EditText) findViewById(R.id.textocontraseña);
                String password = pass.getText().toString();
                String user_stored="";
                String pass_stored="";


                if (usuario.equals(user_stored) & password.equals(pass_stored)){

                    log_success=true;
                    findViewById(R.id.badLog).setVisibility(View.INVISIBLE);
                    change_activity();

                }

                else {
                    log_success=false;
                    findViewById(R.id.badLog).setVisibility(View.VISIBLE);

                }
            }

        });
    }

    public void loginadmin() {

        Button Login_admin = (Button) findViewById(R.id.botonadministrador);
        Login_admin.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText user=(EditText) findViewById(R.id.textonombre);
                String usuario = user.getText().toString();
                EditText pass=(EditText) findViewById(R.id.textocontraseña);
                String password = pass.getText().toString();
                String user_stored="admin";
                String pass_stored="abc123";


                if (usuario.equals(user_stored) & password.equals(pass_stored)){

                    log_success=true;
                    findViewById(R.id.badLog).setVisibility(View.INVISIBLE);
                    change_activity2();

                }

                else {
                    log_success=false;
                    findViewById(R.id.badLog).setVisibility(View.VISIBLE); // Hago visible el mensaje de error en el user or pass.

                }
            }

        });
    }

    public void change_activity () {
        Intent myIntent = new Intent(getApplicationContext(), menuusuario.class);
        startActivity(myIntent); // Cambio de aplicación
    }


    public void change_activity2 () {
        Intent myIntent = new Intent(getApplicationContext(), menuadmin.class);
        startActivity(myIntent); // Cambio de aplicación
    }


}