/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2.Percobaan6;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class MainBangunRuang {

    public static void main(String[] args) {
        int pilihan;
        double sisiKubus, panjang, lebar, tinggi = 0; //inisialisai eror

        VolumeBangunRuang objBangunRuang = new VolumeBangunRuang();

        pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilihlah: "
                + "\n1. Jika ingin menghitung volume kubus"
                + "\n2. Jika ingin menghitung volume balok"));

        if (pilihan == 1) {
            sisiKubus = Double.parseDouble("Masukan sisi kubus");
            objBangunRuang.volumeKubus(tinggi);
        } else if (pilihan == 2) {
            panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang balok"));
            lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang lebar"));
            tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang tinggi"));

             
            JOptionPane.showMessageDialog(null, objBangunRuang.volumeBalok(panjang, lebar, tinggi));
        } else {
            JOptionPane.showMessageDialog(null, "Masukan anda salah...");
        }
    }
}
