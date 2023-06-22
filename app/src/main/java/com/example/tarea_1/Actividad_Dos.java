package com.example.tarea_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad_Dos extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_dos);



        TextView textView18 = (TextView) findViewById(R.id.textView18);
        TextView textView19 = (TextView) findViewById(R.id.textView19);
        TextView textView20 = (TextView) findViewById(R.id.textView20);
        TextView textView21 = (TextView) findViewById(R.id.textView21);
        TextView textView22 = (TextView) findViewById(R.id.textView22);
        TextView textView23 = (TextView) findViewById(R.id.textView23);
        TextView textView24 = (TextView) findViewById(R.id.textView24);

        Bundle bundle = this.getIntent().getExtras();



        textView18.setText(
                bundle.getString("CEDULA"));

        textView19.setText(
                bundle.getString("NOMBRE"));
        textView20.setText(
                bundle.getString("FECHA"));
        textView21.setText(
                bundle.getString("CIUDAD"));
        textView22.setText(
                bundle.getString("GENERO"));
        textView23.setText(
                bundle.getString("CORREO"));
        textView24.setText(
                bundle.getString("TELEFONO"));

    }
}