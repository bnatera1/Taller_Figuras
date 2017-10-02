package com.example.redes.figuras;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cilindro extends AppCompatActivity {

    private EditText Radio,Altura;
    private Intent in;
    private Bundle b;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);
        resources = this.getResources();
        Radio = (EditText)findViewById(R.id.txtRadioCi);
        Altura = (EditText)findViewById(R.id.txtAlturaCi);
        in = new Intent(this,Cilindro1.class);
        b = new Bundle();

    }

    public void CalcularCi(View v) {
        if (Validar()) {
            setContentView(R.layout.activity_cilindro);
            String res = "", opera, dato;
            double radio, altura, total;

            radio = Double.parseDouble(Radio.getText().toString());
            altura = Double.parseDouble(Altura.getText().toString());
            total = 3.1416 * radio * radio * altura;
            res = res + total + "Mts³";
            dato = "Radio : " + Radio.getText().toString() + " , " + "Altura : " + Altura.getText().toString();
            opera = "Volumen del Cilindo ";


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
        if(Altura.getText().toString().isEmpty()){
            Altura.setError(resources.getString(R.string.error1));
            return  false;
        }

        if(Integer.parseInt(Radio.getText().toString())<=0){
            Radio.setError(resources.getString(R.string.error2));
            return false;
        }
        if(Integer.parseInt(Altura.getText().toString())<=0){
            Altura.setError(resources.getString(R.string.error2));
            return false;
        }
        return true;
    }
    public void LimpiarCi (View v){
        Radio.setText("");
        Altura.setText("");
        Radio.requestFocus();
        Altura.requestFocus();
    }

    public void Regresar (View v){
        this.finish();
    }
}
