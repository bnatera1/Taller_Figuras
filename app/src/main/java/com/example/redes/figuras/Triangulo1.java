package com.example.redes.figuras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Triangulo1 extends AppCompatActivity {
    private TextView mostar;
    private String  aux;
    private double resultado;
    private Intent i;
    private Bundle b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo1);

        mostar = (TextView)findViewById(R.id.txtRes_Trian);
        b = getIntent().getExtras();
        resultado = b.getDouble("Area");
        aux = " "+ resultado;
        mostar.setText(aux);
    }
    public void RegresarTri (View v){
        this.finish();
    }
}
