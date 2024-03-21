/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_1.Percobaan_3;

/**
 *
 * @author lab25601
 */
public class TestPersegiPanjang {

        public static void main(String[] args) {
                PersegiPanjang ps1 = new PersegiPanjang();
                PersegiPanjang ps2 = new PersegiPanjang();

                // Memeberikan nilai pada objek 1
                ps1.panjang = 4;
                ps1.lebar = 4;

                // Memberikan nilai pada objek 2
                ps2.panjang = 6;
                ps2.lebar = 7;

                // menampilkan data objek 1
                System.out.println("Persegi Panjang 1");
                System.out.println("Panjang : " + ps1.panjang);
                System.out.println("Lebar : " + ps1.lebar);
                System.out.println("Luas persegi Panjang 1 : " + ps1.luas() + " cm2");
                ps1.keliling();

                // Menampilkan data objek 2
                System.out.println("Persegi Panjang 2");
                System.out.println("Panjang : " + ps2.panjang);
                System.out.println("Lebar : " + ps2.lebar);
                System.out.println("Luas persegi Panjang 2 : " + ps2.luas() + " cm2");
                ps2.keliling();

                // Menambah object
                PersegiPanjang pp1 = new PersegiPanjang();

                // Memberi nilai pada object ppl1
                pp1.panjang = 4;
                pp1.lebar = 6;
                
                // Menampilkan object ppl1
                System.out.println("Persegi Panjang ppl1");
                System.out.println("Panjang : " + pp1.panjang);
                System.out.println("Panjang : " + pp1.lebar);
                System.out.println("Luar Persegi Panjang ppl1 : " + pp1.luas() + " cm2");
        }
}
