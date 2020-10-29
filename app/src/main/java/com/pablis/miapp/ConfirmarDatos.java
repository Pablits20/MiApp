package com.pablis.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        String strNombre = getIntent().getStringExtra("nombre");
        TextView nombre = (TextView) findViewById(R.id.textonombre);
        nombre.setText(nombre.getText() + strNombre);

        String strTelefono = getIntent().getStringExtra("telefono");
        TextView telefono = (TextView) findViewById(R.id.textotelefono);
        telefono.setText(telefono.getText() + strTelefono);

        String strMail = getIntent().getStringExtra("mail");
        TextView mail = (TextView) findViewById(R.id.textomail);
        mail.setText(mail.getText() + strMail);

        String strDescripcion = getIntent().getStringExtra("descripcion");
        TextView descripcion = (TextView) findViewById(R.id.textodescripcion);
        descripcion.setText(descripcion.getText() + strDescripcion);

        String strFecha = getIntent().getStringExtra("fecha");
        TextView fecha = (TextView) findViewById(R.id.textofecha);
        fecha.setText(fecha.getText() + strFecha);
    }
    public void sendMessage(View view) {
        // Do something in response to button click
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}