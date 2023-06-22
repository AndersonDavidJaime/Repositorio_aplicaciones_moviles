package com.example.tarea_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private String fecha_nacimiento;
    private String fecha_vivo;


    private EditText et_fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_fecha = findViewById(R.id.et_fecha);
        String selectedDate;

    }

    public void Enviar(View view){
        EditText et_cedula = (EditText) findViewById(R.id.et_cedula);
        EditText et_nombre = (EditText) findViewById(R.id.et_nombre);
        EditText et_ciudad = (EditText) findViewById(R.id.et_ciudad);
        EditText et_correo = (EditText) findViewById(R.id.et_correo);
        EditText et_celular = (EditText) findViewById(R.id.et_ceular);
        RadioButton rb_masculino = (RadioButton) findViewById(R.id.rb_masculino);
        RadioButton rb_femenino = (RadioButton) findViewById(R.id.rb_femenino);

        String nombre = et_nombre.getText().toString();
        String cedula = et_cedula.getText().toString();
        String ciudad= et_ciudad.getText().toString();
        String genero = rb_masculino.isChecked()?"masculino":"femenino";
        String correo = et_correo.getText().toString();
        String telefono = et_celular.getText().toString();
        String fecha = et_fecha.getText().toString();


        Intent intent = new Intent(MainActivity.this, Actividad_Dos.class);
        Bundle b = new Bundle();
        b.putString("CEDULA", cedula);
        b.putString("NOMBRE", nombre);
        b.putString("CIUDAD", ciudad);
        b.putString("GENERO", genero);
        b.putString("CORREO", correo);
        b.putString("TELEFONO", telefono);
        b.putString("FECHA", fecha);
        intent.putExtras(b);
        startActivity(intent);

    }

    public void limpiar(View view) {
        EditText et_cedula = (EditText) findViewById(R.id.et_cedula);
        EditText et_nombre = (EditText) findViewById(R.id.et_nombre);

        EditText et_ciudad = (EditText) findViewById(R.id.et_ciudad);
        EditText et_correo = (EditText) findViewById(R.id.et_correo);
        EditText et_celular = (EditText) findViewById(R.id.et_ceular);
        RadioButton rb_masculino = (RadioButton) findViewById(R.id.rb_masculino);
        RadioButton rb_femenino = (RadioButton) findViewById(R.id.rb_femenino);


        if(et_fecha.getText().toString()!="") {
            et_fecha.setText("");
        }
        if(et_cedula.getText().toString()!="") {
            et_cedula.setText("");
        }
        if(et_nombre.getText().toString()!="") {
            et_nombre.setText("");
        }

        if(et_ciudad.getText().toString()!="") {
            et_ciudad.setText("");
        }
        if(et_correo.getText().toString()!="") {
            et_correo.setText("");
        }
        if(et_celular.getText().toString()!="") {
            et_celular.setText("");
        }
        if(rb_masculino.isChecked()||rb_femenino.isChecked()){
            rb_masculino.setChecked(false);
            rb_femenino.setChecked(false);
        }

    }
    public void mostrarCalendario(View view) {
        final Calendar calendar = Calendar.getInstance();
        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);


        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int anio, int mes, int dia) {
                        fecha_nacimiento = dia + "/" + (mes + 1) + "/" + anio;
                        et_fecha.setText(fecha_nacimiento);

                    }
                }, anio, mes, dia);

        datePickerDialog.show();
    }

}