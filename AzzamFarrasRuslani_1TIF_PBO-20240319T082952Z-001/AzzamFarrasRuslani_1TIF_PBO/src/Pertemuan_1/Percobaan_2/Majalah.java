/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_1.Percobaan_2;

/**
 *
 * @author lab25601
 */
public class Majalah {
    String nama;
    
    void info () {
        System.out.println("Nama Majalah : " + nama );
    }
    
    String jenis;
    void spesialisasi () {
        System.out.println("Spesialisasi Majalah : " + jenis);
    }

     // Metode non-statis
     void spesialisasi(String jenis) {
        System.out.println("Spesialisasi Majalah: " + jenis);
    }
}
