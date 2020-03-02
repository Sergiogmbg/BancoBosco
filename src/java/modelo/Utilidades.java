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
}
