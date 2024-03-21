/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2.Percobaan5;

/**
 *
 * @author Admin
 */
public class OperasiMath {

    int tambah() {
        int num1 = 10;
        int num2 = 20;
        int hasilTambah = num1 + num2;
        return hasilTambah;
    }

//    tambahan
    int kurang() {
        int num1 = 10;
        int num2 = 20;
        int hasilKurang = num1 - num2;
        return hasilKurang;
    }

    int kali() {
        int num1 = 10;
        int num2 = 20;
        int hasilKali = num1 * num2;
        return hasilKali;
    }

    String bagi() {

        int num1 = 10;
        int num2 = 20;
        int hasilBagi = num1 / num2;
        return "Hasil Kalimat : " +hasilBagi;
    }

    public static void main(String[] args) {
        OperasiMath obj1 = new OperasiMath();

        System.out.println("Hasil tambah: " + obj1.tambah());
        System.out.println("Hasil kurang: " + obj1.kurang());
        System.out.println("Hasil kali: " + obj1.kali());
        System.out.println("Adalah " + obj1.bagi());
    }
}
