/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_1.Percobaan_5;

/**
 *
 * @author lab25601
 */
public class Lingkaran {
    double jari_jari;
    final double pi = 3.14;
    
    double luasLingkaran () {
        double luas = pi * jari_jari * jari_jari;
        return luas;
    }
    
    double kelLingkaran() {
        double kel = 2 * pi * jari_jari;
        return kel;
    }
    
    void status() {
        System.out.println("Program Selesai....");
    }
}
