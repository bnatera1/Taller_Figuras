package com.example.redes.figuras;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Esfera extends AppCompatActivity {
    private EditText Radio;
    private Intent in;
    private Bundle b;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        resources = this.getResources();
        Radio = (EditText)findViewById(R.id.txtRadioEs);
        in = new Intent(this,Esfera1.class);
        b = new Bundle();

    }

    public void CalcularEs(View v) {
        if (Validar()) {
            setContentView(R.layout.activity_esfera);
            String res = "", opera, dato;
            double radio, altura, total;

            radio = Double.parseDouble(Radio.getText().toString());
            total = (4 * 3.1416 * radio * radio * radio) / 3;
            res = res + total + "Mts³";
            dato = "Radio : " + Radio.getText().toString();
            opera = "Volumen de la Esfera";


            b.putDouble("Volumen", total);
            in.putExtras(b);
            Operacion o = new Operacion(opera, dato, res);
            o.guardar();
            startActivity(in);
        }
    }

    public boolean Validar(){
        if(Radio.getText().toString().isEmpty()){
            Radio.setError(resources.getString(R.string.error1));
            return false;
        }

        if(Integer.parseInt(Radio.getText().toString())<=0){
            Radio.setError(resources.getString(R.string.error2));
            return false;
        }

        return true;
    }
    public void Limpiar (View v){
        Radio.setText("");
        Radio.requestFocus();
    }
    public void Regresar (View v){
        this.finish();
    }
}
