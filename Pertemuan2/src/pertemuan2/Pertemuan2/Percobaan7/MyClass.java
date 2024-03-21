/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2.Percobaan7;

/**
 *
 * @author Admin
 */
public class MyClass {
    static void myMethod (String fname, int age) {
        System.out.println(fname + " is " + age);
    }
    
//    tambahan 
    public int tambah (int bil1, int bil2) {
        System.out.println();
        int hasil = bil1 +  bil2;
        return hasil;
    }
    
    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
        
        MyClass obj = new MyClass();
        System.out.println("Hasil penjumlahan bil 1 dan bil 2 adalah : " + obj.tambah(1, 4));
    }
}
