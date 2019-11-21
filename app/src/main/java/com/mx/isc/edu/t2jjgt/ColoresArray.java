package com.mx.isc.edu.t2jjgt;
import java.util.ArrayList;
public class ColoresArray {
    public static ArrayList<String> listaColores=new ArrayList<String>();
    public static void agregar(String name){
        listaColores.add(name);
    }
    public static ArrayList<String>mostrar(){
        return listaColores;
    }
}
