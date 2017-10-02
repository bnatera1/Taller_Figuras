package com.example.redes.figuras;

/**
 * Created by Redes on 26/09/2017.
 */

public class Operacion {
    private String op;
    private String dato;
    private String res;

    public Operacion(String op, String dato, String res){
        this.op = op;
        this.dato = dato;
        this.res = res;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public void guardar(){
        Dato.guardar(this);
    }
}
