package com.example.redes.figuras;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Cuadrado extends AppCompatActivity {
    private EditText Lado;
    private Intent in;
    private Bundle b;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        resources = this.getResources();
        Lado = (EditText)findViewById(R.id.txtLado);

        in = new Intent(this,Cuadrado1.class);
        b = new Bundle();

    }


    public void Calcular(View v) {

        if (Validar()) {
            setContentView(R.layout.activity_cuadrado);
            String res = "", opera, dato;
            double lado, total;

            lado = Double.parseDouble(Lado.getText().toString());

            total = lado * lado;
            res = res + total + "Mts²";
            dato = "Lado : " + Lado.getText().toString();
            opera = "Area del Cuadrado ";


            b.putDouble("Area", total);
            in.putExtras(b);
            Operacion o = new Operacion(opera, dato, res);
            o.guardar();
            startActivity(in);
        }
    }

    public boolean Validar(){
        if(Lado.getText().toString().isEmpty()){
            Lado.setError(resources.getString(R.string.error1));
            return false;
        }
        if(Integer.parseInt(Lado.getText().toString())<=0){
            Lado.setError(resources.getString(R.string.error2));
            return false;
        }
        return true;
    }
    public void LimpiarCua (View v){
        Lado.setText("");
        Lado.requestFocus();
    }

}
