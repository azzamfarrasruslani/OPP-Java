package pertemuan2.Latihan1_2;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class BangunDatar {

    public double luasBangunDt(int pilihan) {
        double panjang, lebar, hasil, alas, tinggi, jari;
        pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Pilihan Bangun Datar\n1.Persegi Panjang\n2.Segitiga\n3.Lingkaran"));
        switch (pilihan) {
            case 1:
                panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang"));
                lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukan lebar"));
                hasil = panjang * lebar;
                JOptionPane.showMessageDialog(null, "luas : " + hasil);
                break;
            case 2:
                alas = Double.parseDouble(JOptionPane.showInputDialog("Masukan alas"));
                tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukan tinggi"));
                hasil = (alas * tinggi) / 2;
                JOptionPane.showMessageDialog(null, "luas : " + hasil);
                break;
            case 3:
                jari = Double.parseDouble(JOptionPane.showInputDialog("Masukan jari-jari"));
                hasil = 3.14 * jari * jari;
                JOptionPane.showMessageDialog(null, "luas : " + hasil);
                break;
            default:
                throw new AssertionError();
        }
        return hasil;
    }
}
