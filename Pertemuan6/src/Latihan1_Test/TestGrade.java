package Latihan1_Test;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;

public class TestGrade {

     public static void main(String[] args) {
        String ulang;
        int jmlSw;
        do {
            jmlSw = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Siswa"));
            Latihan1.Grade siswa[] = new Latihan1.Grade[jmlSw];
            // Membuat array of object
            for (int i = 0; i < siswa.length; i++) {
                siswa[i] = new Latihan1.Grade();
                siswa[i].setNama(JOptionPane.showInputDialog("Masukan Nama Siswa ke-" + (i + 1)));
                siswa[i].setNim(JOptionPane.showInputDialog("Masukan Nim Siswa Dari " + siswa[i].getNama()));
                siswa[i].setNilaiUjian(Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Ujian siswa Dari " + siswa[i].getNama())));
            }

            int pilihan;
            do {
                pilihan = Integer.parseInt(JOptionPane.showInputDialog("Opsi Pilihan \n1. Menampilkan Data \n2. Keluar"));
                switch (pilihan) {
                    case 1:
                        // Output data
                        System.out.println("=================================================================================================");
                        System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s| \n", "No", "Nama", "Nim", "Nilai Akhir", "Nilai Huruf", "Hadiah");
                        System.out.println("=================================================================================================");
                        for (int i = 0; i < siswa.length; i++) {
                            System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s| \n", i + 1, siswa[i].getNama(), siswa[i].getNim(), siswa[i].getNilaiUjian(),
                                    siswa[i].grade(siswa[i].getNilaiUjian()), siswa[i].hadiah(siswa[i].grade(siswa[i].getNilaiUjian())));
                        }
                        break;
                    case 2:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Pilihan tidak valid");
                        break;
                }
            } while (pilihan != 2);
            ulang = JOptionPane.showInputDialog("Apakah anda masih ingin menjalankan program ? \n1. ya\n2. tidak");
        } while (ulang.equalsIgnoreCase("ya"));

    }
}
