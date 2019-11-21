package com.mx.isc.edu.t2jjgt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Objects;

public class frm3mostrar extends AppCompatActivity implements View.OnClickListener {
Button b1;
Spinner s1;
ArrayAdapter<String>colores ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm3mostrar);
        Objects.requireNonNull(getSupportActionBar()).hide();
        b1=findViewById(R.id.button7);
        s1=findViewById(R.id.spinner2);
        b1.setOnClickListener(this);
        colores= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ColoresArray.mostrar());
        s1.setAdapter(colores);
    }

    @Override
    public void onClick(View view) {
        Intent inte=new Intent(this,MainActivity.class);
        startActivity(inte);
        this.finish();
    }
    public void bToast(View view) {
        Toast to1=Toast.makeText(getApplicationContext(), s1.getSelectedItem().toString(), Toast.LENGTH_SHORT);
        to1.show();
    }
}
