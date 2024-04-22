/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5.Percobaan5;

/**
 *
 * @author Admin
 */
public class LingkaranLagi {
    private double jari_jari;
    private final double pi= 3.14;

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }
    
    
    public double luasLingkaran() {
        double luas = 2 * pi * jari_jari;
        return luas;
    }
    
    public double kelLingkaran () {
        double kel = pi * jari_jari * jari_jari;
        return kel;
    }
}
