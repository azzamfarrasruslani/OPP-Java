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
import javax.swing.JOptionPane;

public class TestPrintNilai {

    public static void main(String[] args) {
        PrintNilai obj = new PrintNilai();
        for (int i = 0; i < 5; i++) {
            obj.printNama("PCR");
        }
        System.out.println("");

        int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukan pilihan : "
                + "\n1. Mencetak Nama"
                + "\n2. Mencetak bintang"));

        String jawab;

        do {
            switch (pilihan) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        obj.printNama("PCR");
                    }
                    System.out.println("");
                    break;
                case 2:
                    obj.bintang(5);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
            jawab = JOptionPane.showInputDialog("Apakah ingin memlih lagi");
            pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukan pilihan : "
                + "\n1. Mencetak Nama"
                + "\n2. Mencetak bintang"
                    + "\n3. Keluar"));
        } while (jawab.equalsIgnoreCase("Ya"));
        
    }

}
