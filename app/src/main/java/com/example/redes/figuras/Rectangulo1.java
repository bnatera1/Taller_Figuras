package com.example.redes.figuras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Rectangulo1 extends AppCompatActivity {
    private TextView mostar;
    private String  aux;
    private double resultado;
    private Intent i;
    private Bundle b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo1);

        mostar = (TextView)findViewById(R.id.txtRes_Restan);
        b = getIntent().getExtras();
        resultado = b.getDouble("Area");
        aux = " "+ resultado;
        mostar.setText(aux);
    }
}
