/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_1.Percobaan_5;
import java.util.Scanner;
/**
 *
 * @author lab25601
 */
public class MainClass {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        
        Lingkaran objLing1 = new Lingkaran();
        Lingkaran objLing2 = new Lingkaran ();
        
        // System.out.println("Masukan jari-jari lingkaran : ");
        // double jari_jari = input.nextDouble();
        
        objLing1.jari_jari= 4;
        objLing2.jari_jari= 2;
        
        System.out.println("Luas lingkaran: " + objLing1.luasLingkaran());
        System.out.println("Luas lingkaran: " + objLing2.luasLingkaran());
        System.out.println("kel lingkaran: " + objLing1.kelLingkaran());
        System.out.println("kel lingkaran: " + objLing2.kelLingkaran());
        objLing1.status();
    }
}
