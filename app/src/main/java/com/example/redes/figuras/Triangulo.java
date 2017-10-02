package com.example.redes.figuras;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Triangulo extends AppCompatActivity {
    private EditText Base,Altura;
    private Intent in;
    private Bundle b;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        resources = this.getResources();
        Base = (EditText)findViewById(R.id.txtBaseT);
        Altura = (EditText)findViewById(R.id.txtAlturaT);
        in = new Intent(this,Triangulo1.class);
        b = new Bundle();

    }

    public void CalcularTrian(View v) {
        if (Validar()) {
            setContentView(R.layout.activity_triangulo);
            String res = "", opera, dato;
            double base, altura, total;

            base = Double.parseDouble(Base.getText().toString());
            altura = Double.parseDouble(Altura.getText().toString());
            total = (base * altura) / 2;
            res = res + total + "Mts²";
            dato = "Base : " + Base.getText().toString() + " , " + "Altura : " + Altura.getText().toString();
            opera = "Area del Tiangulo";


            b.putDouble("Area", total);
            in.putExtras(b);
            Operacion o = new Operacion(opera, dato, res);
            o.guardar();
            startActivity(in);
        }
    }

    public boolean Validar(){
        if (Base.getText().toString().isEmpty()){
            Base.setError(resources.getString(R.string.error1));
            return  false;
        }
        if(Altura.getText().toString().isEmpty()){
            Altura.setError(resources.getString(R.string.error1));
            return  false;
        }
        if(Integer.parseInt(Base.getText().toString())<=0){
            Base.setError(resources.getString(R.string.error2));
            return false;
        }
        if(Integer.parseInt(Altura.getText().toString())<=0){
            Altura.setError(resources.getString(R.string.error2));
            return false;
        }

        return true;
    }
    public void Limpiar (View v){
        Base.setText("");
        Altura.setText("");
        Base.requestFocus();
        Altura.requestFocus();
    }
    public void Regresar (View v){
        this.finish();
    }
}
