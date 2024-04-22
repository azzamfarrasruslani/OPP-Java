
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5.Percobaan3;

/**
 *
 * @author Admin
 */
public class TestMobil extends Mobil{
    public static void main(String[] args) {
        Mobil m1 = new Mobil();
        Mobil m2 = new Mobil();
        
        m1.merek = "Toyota";
        m1.warna = "Hitam";
        
        System.out.println(m1.warna);
        System.out.println(m1.merek);
        m1.beriWarna();
        m1.beriMerek();
    }
}
