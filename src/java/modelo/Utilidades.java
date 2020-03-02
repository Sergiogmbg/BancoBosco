/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author DAW204
 */
public class Utilidades {
    public static ArrayList<String> generarLista() {
        ArrayList<String> listaTiempo = new ArrayList<String>();
        
        for (int i = 1; i < 15; i++) {
            String t = String.valueOf(i*12);
            listaTiempo.add(t);
        }
        return listaTiempo;
    }
    
    public static ArrayList<Cuota> generaListaCuotas(int num_cuotas, double importeTotalPrestamo) {
        ArrayList<Cuota> listaCuotas = new ArrayList<Cuota>();
        
        for (int i = 1; i <= num_cuotas; i++) {
            int importeCuota = (int) (importeTotalPrestamo / num_cuotas);
            int intereses = importeCuota - (importeCuota*(i-1) / num_cuotas);
            int capital = importeCuota - intereses;
            Cuota c = new Cuota(i, importeCuota, capital,intereses);
            listaCuotas.add(c);
        }
        
        return listaCuotas;
    }
}
