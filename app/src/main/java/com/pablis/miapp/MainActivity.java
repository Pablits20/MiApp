package com.pablis.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {

        EditText etNombre = (EditText) findViewById(R.id.nombre);
        EditText etTelefono = (EditText) findViewById(R.id.telefono);
        EditText etMail = (EditText) findViewById(R.id.mail);
        EditText etDescripcion = (EditText) findViewById(R.id.descripcion);
        DatePicker etFecha = (DatePicker) findViewById(R.id.fecha);
        // Do something in response to button click
        Intent intent = new Intent(this, ConfirmarDatos.class);

        intent.putExtra("nombre", etNombre.getText().toString());
        intent.putExtra("telefono", etTelefono.getText().toString());
        intent.putExtra("mail", etMail.getText().toString());
        intent.putExtra("descripcion", etDescripcion.getText().toString());
        intent.putExtra("fecha", String.valueOf(etFecha.getDayOfMonth()).toString() + String.valueOf(etFecha.getMonth()).toString()  + String.valueOf(etFecha.getYear()).toString());

        startActivity(intent);

    }




}