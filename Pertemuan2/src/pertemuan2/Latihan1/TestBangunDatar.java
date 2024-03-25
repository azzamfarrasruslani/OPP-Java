package pertemuan2.Latihan1;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TestBangunDatar {

    public static void main(String[] args) {
        BangunDatar obj = new BangunDatar();

//        System.out.println("Luas Segitiga : " + obj.persegiPanjang(2, 5));
//        double panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang"));
//        double lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukan lebar"));
        int pilihan1, pilihan2;
        double panjang, lebar, alas, tinggi, jari, sisiA, sisiB, sisiC;
        pilihan1 = Integer.parseInt(JOptionPane.showInputDialog("Masukan Pilihan \n1.Menghitung Luas Bangun Datar\n2.Menghitung Keliling Bangun Datar"));
        switch (pilihan1) {

            case 1:
                pilihan2 = Integer.parseInt(JOptionPane.showInputDialog("Masukan Pilihan Bangun Datar\n1.Persegi Panjang\n2.Segitiga\n3.Lingkaran"));
                switch (pilihan2) {
                    case 1:
                        panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang"));
                        lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukan lebar"));
                        obj.lsPersegiPanjang(panjang, lebar);
                        break;
                    case 2:
                        alas = Double.parseDouble(JOptionPane.showInputDialog("Masukan alas"));
                        tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukan tinggi"));
                        obj.lsSegitiga(alas, tinggi);
                        break;
                    case 3:
                        jari = Double.parseDouble(JOptionPane.showInputDialog("Masukan jari-jari"));
                        obj.lsLingkaran(jari);
                }
                break;
            case 2:
                pilihan2 = Integer.parseInt(JOptionPane.showInputDialog("Masukan Pilihan Bangun Datar\n1.Persegi Panjang\n2.Segitiga\n3.Lingkaran"));
                switch (pilihan2) {
                    case 1:
                        panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang"));
                        lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukan lebar"));
                        obj.klPersegiPanjang(panjang, lebar);
                        break;
                    case 2:
                        sisiA = Double.parseDouble(JOptionPane.showInputDialog("Masukan sisi A"));
                        sisiB = Double.parseDouble(JOptionPane.showInputDialog("Masukan sisi B"));
                        sisiC = Double.parseDouble(JOptionPane.showInputDialog("Masukan sisi C"));
                        obj.klSegitiga(sisiA, sisiB, sisiC);
                        break;
                    case 3:
                        jari = Double.parseDouble(JOptionPane.showInputDialog("Masukan jari-jari"));
                        obj.klLingkaran(jari);
                        break;

                }
        }

    }
}
