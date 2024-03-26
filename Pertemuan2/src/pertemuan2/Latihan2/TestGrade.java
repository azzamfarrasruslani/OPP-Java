package pertemuan2.Latihan2;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TestGrade {

    public static void main(String[] args) {
        int latihan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai Latihan Mahasiswa"));
        int kuis = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai Kuis Mahasiswa"));
        int uts = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai UTS Mahasiswa"));
        int uas = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai UAS Mahasiswa"));
        Grade obj = new Grade();
        String nilaiHuruf = null;
        System.out.println("Nilai Latihan : " + latihan + "\nNilai Kuis : " + kuis+
                "\nNilai UTS : " + uts + "\nNilai UAS : " + uas);
        System.out.println("Total Nilai : " + obj.getNilai(latihan, kuis, uts, uas));
        System.out.println("Nilai Huruf : " + obj.grade(obj.getNilai(latihan, kuis, uts, uas)));

    

    }
}
