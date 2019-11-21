package com.mx.isc.edu.t2jjgt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class frm2agregar extends AppCompatActivity implements View.OnClickListener {
Button b1;
EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2agregar);
        Objects.requireNonNull(getSupportActionBar()).hide();
        b1=findViewById(R.id.button4);
        b1.setOnClickListener(this);
        e1=findViewById(R.id.editText);
    }

    @Override
    public void onClick(View view) {
        Intent inte=new Intent(this,MainActivity.class);
        startActivity(inte);
        this.finish();
    }
    public void bGuardar(View view) {
        if(e1.getText().equals(null)){
            Toast to1=Toast.makeText(getApplicationContext(), "campo vacio", Toast.LENGTH_SHORT);
            to1.show();
        }else{
            ColoresArray.agregar( e1.getText().toString());
            Toast to1=Toast.makeText(getApplicationContext(), e1.getText().toString(), Toast.LENGTH_SHORT);
            to1.show();
            e1.setText("");
        }



    }
    public void bMostrar(View view) {
        Intent inte=new Intent(this,frm3mostrar.class);
        startActivity(inte);
        this.finish();
    }
}
