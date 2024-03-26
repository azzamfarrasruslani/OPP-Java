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
        int jmlGr = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah guru"));
        String nama = null, nilaiHuruf = null;
        double nilai = 0;
        double latihan, kuis, uts, uas;
        String dtSw[][] = new String[jmlSw][3];
        String dtGuru[][] = new String [jmlGr][2];
        for (int i = 0; i < jmlSw; i++) {

            dtSw[i][0] = Program.getNama();
            latihan = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Latihan Mahasiswa"));
            kuis = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Kuis Mahasiswa"));
            uts = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai UTS Mahasiswa"));
            uas = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai UAS Mahasiswa"));
            dtSw[i][1] = String.valueOf(obj.calNilai(latihan, kuis, uts, uas));
            dtSw[i][2] = obj.grade(obj.calNilai(latihan, kuis, uts, uas));
        }
        System.out.println("=================================================================");
        System.out.printf("|%-15s|%-15s|%-15s|%-15s| \n","No", "Nama", "Nilai Akhir", "Nilai Huruf");
        System.out.println("=================================================================");
        for (int i = 0; i < dtSw.length; i++) {
           System.out.printf("|%-15s|%-15s|%-15s|%-15s| \n",i+1, dtSw[i][0], dtSw[i][1], dtSw[i][2]);
        }
        
        for (int i = 0; i < dtGuru.length; i++) {
           dtGuru[i][0]= Program.getNamaGr();
           dtGuru[i][1]= Program.getMapel();
        }
        
        System.out.println("=================================================================");
        System.out.printf("|%-15s|%-15s|%-15s| \n","No", "Nama", "Mata Pelajaran");
        System.out.println("=================================================================");
        for (int i = 0; i < dtSw.length; i++) {
           System.out.printf("|%-15s|%-15s|%-15s| \n",i+1, dtGuru[i][0], dtGuru[i][1]);
        }
        
    }

}
