package com.example.redes.figuras;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cubo extends AppCompatActivity {
    private EditText Arista;
    private Intent in;
    private Bundle b;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        resources = this.getResources();
        Arista = (EditText)findViewById(R.id.txtArista);
        in = new Intent(this,Cubo1.class);
        b = new Bundle();

    }

    public void CalcularCu(View v) {
        if (Validar()) {
            setContentView(R.layout.activity_cubo);
            String res = "", opera, dato;
            double arista, total;

            arista = Double.parseDouble(Arista.getText().toString());
            total = arista * arista * arista;
            res = res + total + "Mts³";
            dato = "Arista : " + Arista.getText().toString();
            opera = "Volumen del Cubo";


            b.putDouble("Volumen", total);
            in.putExtras(b);
            Operacion o = new Operacion(opera, dato, res);
            o.guardar();
            startActivity(in);
        }
    }

    public boolean Validar(){
        if(Arista.getText().toString().isEmpty()){
            Arista.setError(resources.getString(R.string.error1));
            return false;
        }
        if(Integer.parseInt(Arista.getText().toString())<=0){
            Arista.setError(resources.getString(R.string.error2));
            return false;
        }
        return true;
    }
    public void Limpiar (View v){
        Arista.setText("");
        Arista.requestFocus();
    }
}
