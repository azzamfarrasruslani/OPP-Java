/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5.Percobaan5;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class TestLingkaran1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LingkaranLagi obj = new LingkaranLagi();
        
        System.out.println("Masukan nilai Jari - jari : ");
        double jari = input.nextDouble();
        obj.setJari_jari(jari);
        System.out.println("Luas Lingkaran : " + obj.luasLingkaran());
        System.out.println("Keliling Lingkaran : " + obj.kelLingkaran());
    }
}
