package Pertemuan2.Percobaan3;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ClassBangunRuang {

    static void volumeKubus(double sisi) {
        double volume = sisi * sisi * sisi;
        JOptionPane.showMessageDialog(null, "Volume kubus: " + volume);
    }

    static double volumeBalok(double panjang, double lebar, double tinggi) {
        double volume = panjang * lebar * tinggi;
        return volume;
    }

    static void volumeTabung(double jari, double tinggi) {
        double volume = 3.14 * jari * jari * tinggi;
        JOptionPane.showMessageDialog(null, "Volume tabung " + volume);
    }

//    tambahan
    static double volumeKerucut(double jari, double tinggi) {
        double volume = (3.14 * jari * jari * tinggi) / 3;
        return volume;
    }

    public static void main(String[] args) {
        int pilihan;
        double sisiKubus, panjang = 0, lebar, tinggi = 0, jari, volume;

        pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilihlah : \n1. Jika ingin menghitung volume kubus"
                + "\n2. Jika ingin menghitung volume balok \n3. Jika ingin menghitung menghitung volume tabung"
                + "\n. Jika ingin menghitung volume kerucut"));
        switch (pilihan) {
            case 1:
                sisiKubus = Double.parseDouble(JOptionPane.showInputDialog("Masukan sisi kubus"));

                volumeKubus(sisiKubus);
                break;
            case 2:
                panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang balok"));
                lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang lebar"));
                tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang tinggi"));

                JOptionPane.showMessageDialog(null, "Volume kubus: " + volumeBalok(panjang, lebar, tinggi));
                break;
            case 3:
                jari = Double.parseDouble(JOptionPane.showInputDialog("Masukan jari-jari tabung"));
                tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang tinggi"));

                volumeTabung(jari, tinggi);
                break;
            case 4:
                jari = Double.parseDouble(JOptionPane.showInputDialog("Masukan jari-jari kerucut"));
                tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang kerucut"));

                JOptionPane.showMessageDialog(null, "Volume kerucut: " + volumeKerucut(jari, tinggi));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Masukan anda salah");
        }
    }

}
