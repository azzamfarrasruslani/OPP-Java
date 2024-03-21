/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2.Percobaan9;

/**
 *
 * @author Admin
 */
public class PrintNilai {
    public void printNama (String nama) {
        System.out.println(nama);
    }
    
    public void bintang(int nilai) {
        for (int i = 1; i <= nilai; i++) {
            for (int j = 1; j <= nilai; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
            
        }
    }
}
