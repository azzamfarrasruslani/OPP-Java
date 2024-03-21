/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2.Percobaan8;

/**
 *
 * @author Admin
 * 
 */
import static Pertemuan2.Percobaan8.ClassDua.bagi;
import static Pertemuan2.Percobaan8.ClassDua.kali;
import static Pertemuan2.Percobaan8.ClassDua.kurang;
import static Pertemuan2.Percobaan8.ClassDua.tambah;
import java.util.Scanner;
public class ClassSatu {
    
//    public static int tambah (int num1, int num2) {
//        return num1 + num2;
//    }
//    
//    public static int kurang (int num1, int num2) {
//        return num1 - num2;
//    }
//    public static int kali (int num1, int num2) {
//        return num1 * num2;
//    }
//    public static int bagi (int num1, int num2) {
//        return num1 / num2;
//    }
//    
//    public void cetak(String kata) {
//        System.out.println("Kata yang anda masukan : " + kata);
//    }
//    
    public static void main(String[] args) {
        double result1, result2, result3, result4;
        
        result1 = tambah(10,4);
        result2 = kurang(10,4);
        result3 = kali(10,4);
        result4 = bagi(10,4);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan sebauh kata : ");
        String txt = input.nextLine();
        
        ClassDua obj = new ClassDua();
        
        System.out.println("Hasil tambah : " + result1);
        System.out.println("Hasil kurang : " + result2);
        System.out.println("Hasil kali : " + result3);
        System.out.println("Hasil bagi : " + result4);
        
        obj.cetak(txt);
    }
    
    
}
