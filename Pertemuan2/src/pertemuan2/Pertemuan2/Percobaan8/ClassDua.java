/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2.Percobaan8;

/**
 *
 * @author Admin
 */
public class ClassDua {
     public static int tambah (int num1, int num2) {
        return num1 + num2;
    }
    
    public static int kurang (int num1, int num2) {
        return num1 - num2;
    }
    public static int kali (int num1, int num2) {
        return num1 * num2;
    }
    public static int bagi (int num1, int num2) {
        return num1 / num2;
    }
    
    public void cetak(String kata) {
        System.out.println("Kata yang anda masukan : " + kata);
    }
}
