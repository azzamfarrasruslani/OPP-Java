package pertemuan2.Latihan3;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TestProgram {

    public static void main(String[] args) {
        Program obj = new Program();

        int jmlSw = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah siswa"));
        String nama = null, nilaiHuruf = null;
        double nilai = 0;
        double latihan, kuis, uts, uas;
        String dtSw[][] = new String[jmlSw][3];
        for (int i = 0; i < jmlSw; i++) {

            dtSw[i][0] = Program.getNama(nama);

            latihan = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Latihan Mahasiswa"));
            kuis = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Kuis Mahasiswa"));
            uts = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai UTS Mahasiswa"));
            uas = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai UAS Mahasiswa"));
            dtSw[i][1] = String.valueOf(obj.calNilai(latihan, kuis, uts, uas));
            dtSw[i][2] = obj.grade(obj.calNilai(latihan, kuis, uts, uas));

            System.out.println("Nama: " + dtSw[i][0]);
            System.out.println("Nilai: " + dtSw[i][1]);
            System.out.println("Nilai Huruf : " + dtSw[i][2]);
            System.out.println("---------------------");
        }

    }

}
