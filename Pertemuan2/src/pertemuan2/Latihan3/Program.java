package pertemuan2.Latihan3;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Program {

    static String getNama(String nama) {
        nama = JOptionPane.showInputDialog("Masukan Nama Siswa");
        return nama;
    }

    public double calNilai(double latihan, double kuis, double uts, double uas) {
        double nilaiAkhir = (latihan + kuis + uts + uas) / 4;
        return nilaiAkhir;
    }

//    public double getNilai(double nilai) {
//        double latihan, kuis, uts, uas;
//        latihan = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Latihan Mahasiswa"));
//        kuis = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Kuis Mahasiswa"));
//        uts = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai UTS Mahasiswa"));
//        uas = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai UAS Mahasiswa"));
//
//    }

    public String grade(double nilaiAkhir) { // Menggunakan parameter int nilai
        String nilaiHuruf;
        if (nilaiAkhir >= 81 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 76 && nilaiAkhir <= 80) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 51 && nilaiAkhir <= 65) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "F";
        }
        return nilaiHuruf;
    }
}
