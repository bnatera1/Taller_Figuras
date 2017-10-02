package com.example.redes.figuras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Cono1 extends AppCompatActivity {
    private TextView mostar;
    private String  aux;
    private double resultado;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono1);
        mostar = (TextView)findViewById(R.id.txtRes_Cono);
        b = getIntent().getExtras();
        resultado = b.getDouble("Volumen");
        aux = " "+ resultado;
        mostar.setText(aux);
    }
}
