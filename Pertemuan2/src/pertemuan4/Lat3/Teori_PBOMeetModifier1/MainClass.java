package Pertemuan4.Lat3.Teori_PBOMeetModifier1;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class MainClass {

    public static void main(String[] args) {

        int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Pilihan\n1. Tambah Bilangan\n2. Kurang Bilangan\n3. Kali Bilangan\n4. Bagi Bilagan"));
        double bil1 = Double.parseDouble(JOptionPane.showInputDialog("Masukan bil 1"));
        double bil2 = Double.parseDouble(JOptionPane.showInputDialog("Masukan bil 2"));
        Teori_PBOMeetModifier1 kalkulator = new Teori_PBOMeetModifier1(bil1, bil2);
        switch (pilihan) {
            case 1:
                System.out.println(kalkulator.tambah());
                break;
            case 2 : 
                System.out.println(kalkulator.kurang());
                break;
            case 3 : 
                System.out.println(kalkulator.kali());
                break;
            case 4 : 
                System.out.println(kalkulator.bagi());
                break;
        }
    }
}
