/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DAW204
 */
public class PrestamoObjeto {
    double cantidad;
    double interes;
    int tiempo;
    double importePrestamo;

    public PrestamoObjeto(double cantidad, double interes, int tiempo) {
        this.cantidad = cantidad;
        this.interes = interes;
        this.tiempo = tiempo;
        this.importePrestamo = calcularImportePrestamo(cantidad, interes, tiempo);
    }

    public static int calcularImportePrestamo(double cantidad, double interes, int tiempo) {
        int interesSimple = (int) ((cantidad*interes*tiempo) / 1200);
        int importePrestamo = (int) (interesSimple + cantidad);
        return importePrestamo;
    }
    
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getImportePrestamo() {
        return importePrestamo;
    }

    public void setImportePrestamo(double importePrestamo) {
        this.importePrestamo = importePrestamo;
    }
    
    
}
