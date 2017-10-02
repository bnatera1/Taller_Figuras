package com.example.redes.figuras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Esfera1 extends AppCompatActivity {
    private TextView mostar;
    private String  aux;
    private double resultado;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera1);

        mostar = (TextView)findViewById(R.id.txtRes_Esfera);
        b = getIntent().getExtras();
        resultado = b.getDouble("Volumen");
        aux = " "+ resultado;
        mostar.setText(aux);
    }
    public void RegresarEs (View v){
        this.finish();
    }
}
