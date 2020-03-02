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
public class Cuota {
    int numeroCuota;
    double importeCuota;
    double capital;
    double intereses;

    public Cuota(int numeroCuota, double importeCuota, double capital, double intereses) {
        this.numeroCuota = numeroCuota;
        this.importeCuota = importeCuota;
        this.capital = capital;
        this.intereses = intereses;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public double getImporteCuota() {
        return importeCuota;
    }

    public double getCapital() {
        return capital;
    }

    public double getIntereses() {
        return intereses;
    }
    
    
}
