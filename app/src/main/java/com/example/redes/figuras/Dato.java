package com.example.redes.figuras;

import java.util.ArrayList;

/**
 * Created by Redes on 26/09/2017.
 */

public class Dato {
    private static ArrayList<Operacion> operaciones = new ArrayList<>();

    public static void guardar(Operacion o){
        operaciones.add(o);
    }

    public static ArrayList<Operacion> getOperaciones(){
        return operaciones;
    }
}
