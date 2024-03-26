package pertemuan2.Latihan3;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Program {

    static String getNama() {
        String nama = JOptionPane.showInputDialog("Masukan Nama Siswa");
        return nama;
    }

    public double calNilai(double latihan, double kuis, double uts, double uas) {
        double nilaiAkhir = (latihan + kuis + uts + uas) / 4;
        return nilaiAkhir;
    }


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
    
    static String getNamaGr() {
        String namaGr = JOptionPane.showInputDialog("Masukan Nama Guru");
        return namaGr;
    }
    
    static String getMapel() {
        String namaMapel = JOptionPane.showInputDialog("Masukan Mata Pelajaran Yang Diampu");
        return namaMapel;
    }
    
    
}
