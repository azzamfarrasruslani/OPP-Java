package Latihan1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;

public class TestGrade {

    public static void main(String[] args) {
        int jmlSw = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Siswa"));
        Grade siswa[] = new Grade[jmlSw];

        //            Membuat array of object       
        for (int i = 0; i < siswa.length; i++) {
            siswa[i] = new Grade();
        }

//        Memasukan data dari atribut
        for (int i = 0; i < siswa.length; i++) {
            siswa[i].setNama(JOptionPane.showInputDialog("Masukan Nama Siswa ke-" + (i + 1)));
            siswa[i].setNim(JOptionPane.showInputDialog("Masukan Nim Siswa Dari " + siswa[i].getNama()));
            siswa[i].setNilaiUjian(siswa[i].calPoin(Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Ujian siswa Dari " + siswa[i].getNama()))));

        }

        //        Output data 
        System.out.println("=================================================================================================");
        System.out.printf("|%-5s|%-15s|%-15s|%-15s|%-15s|%-15s| \n", "No", "Nama", "Nim", "Nilai Akhir", "Nilai Huruf", "Hadiah");
        System.out.println("=================================================================================================");
        for (int i = 0; i < siswa.length; i++) {
            System.out.printf("|%-5s|%-15s|%-15s|%-15s|%-15s|%-15s| \n", i + 1, siswa[i].getNama(), siswa[i].getNim(), siswa[i].getNilaiUjian(),
                    siswa[i].grade(siswa[i].getNilaiUjian()), siswa[i].hadiah(siswa[i].grade(siswa[i].getNilaiUjian())));
        }

    }
}
