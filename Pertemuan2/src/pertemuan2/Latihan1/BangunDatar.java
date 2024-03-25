package pertemuan2.Latihan1;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class BangunDatar {
//    double persegiPanjang (double panjang, double lebar) {
//        double luasPersegiPanjang = panjang * lebar;
//        return luasPersegiPanjang;
//    }

    public void lsPersegiPanjang(double panjang, double lebar) {
        double luasPersegiPanjang = panjang * lebar;
        JOptionPane.showMessageDialog(null, "luas : " + luasPersegiPanjang);
    }

    public void lsSegitiga(double alas, double tinggi) {
        double luasSegitiga = (alas * tinggi) / 2;
        JOptionPane.showMessageDialog(null, "luas : " + luasSegitiga);
    }

    public void lsLingkaran(double jari) {
        double luasLingkaran = 3.14 * jari * jari;
        JOptionPane.showMessageDialog(null, "luas : " + luasLingkaran);
    }

    public void klPersegiPanjang(double panjang, double lebar) {
        double kelPersegiPanjang = 2 * (panjang * lebar);
        JOptionPane.showMessageDialog(null, "luas : " + kelPersegiPanjang);
    }

    public void klSegitiga(double a, double b, double c) {
        double kelSegitiga = a + b + c;
        JOptionPane.showMessageDialog(null, "luas : " + kelSegitiga);
    }

    public void klLingkaran(double jari) {
        double kelPersegiPanjang = 2 * 3.14 * jari;
        JOptionPane.showMessageDialog(null, "luas : " + kelPersegiPanjang);
    }

}
