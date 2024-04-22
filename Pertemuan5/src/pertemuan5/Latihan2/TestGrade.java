package pertemuan5.Latihan2;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TestGrade {

    public static void main(String[] args) {

        String nama = null, nim = null;

        int jmlMhs = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah mahasiswa"));
//        Inisialisasi array 2 dimensi
        String dtSw[][] = new String[jmlMhs][5];
        for (int i = 0; i < dtSw.length; i++) {
//            Membuat objek
            Grade mhs = new Grade();
//            Menetapkan data dengan setter
            mhs.setNama(JOptionPane.showInputDialog("Masukan nama mahasiswa ke-" + (i + 1)));
            mhs.setNim(JOptionPane.showInputDialog("Masukan nim mahasiswa " + mhs.getNama()));
            int latihan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai Latihan Mahasiswa " + mhs.getNama()));
            int kuis = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai Kuis Mahasiswa " + mhs.getNama()));
            int uts = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai UTS Mahasiswa " + mhs.getNama()));
            int uas = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai UAS Mahasiswa " + mhs.getNama()));
            mhs.setNilaiAkhir(mhs.addPoin(mhs.calNilai(latihan, kuis, uts, uas)));
//            Mendapatkan data dengan getter
            dtSw[i][0] = mhs.getNama();
            dtSw[i][1] = mhs.getNim();
            dtSw[i][2] = String.valueOf(mhs.addPoin(mhs.getNilaiAkhir()));
            dtSw[i][3] = mhs.grade(mhs.getNilaiAkhir());
            dtSw[i][4] = mhs.hadiah(mhs.getNilaiAkhir());

        }
//        Output data 
        System.out.println("=================================================================================================");
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s| \n", "No", "Nama", "Nim", "Nilai Akhir", "Nilai Huruf", "Hadiah");
        System.out.println("=================================================================================================");
        for (int i = 0; i < dtSw.length; i++) {
            System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s| \n", i + 1, dtSw[i][0], dtSw[i][1], dtSw[i][2], dtSw[i][3], dtSw[i][4]);
        }
    }
}
