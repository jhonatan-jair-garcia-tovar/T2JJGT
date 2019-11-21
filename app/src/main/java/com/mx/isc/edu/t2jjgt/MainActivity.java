package com.mx.isc.edu.t2jjgt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        b1=findViewById(R.id.button);
        b1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent inte=new Intent(this,frm2agregar.class);
        startActivity(inte);
        this.finish();
    }
    public void bMostrar(View view) {
        Intent inte=new Intent(this,frm3mostrar.class);
        startActivity(inte);
        this.finish();
    }
}
