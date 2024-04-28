package Latihan2;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;

public class TestDataMhs {

    public static void main(String[] args) {
        DataMhs mhs[] = new DataMhs[10];

        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new DataMhs();
        }

        for (int i = 0; i < mhs.length; i++) {
            mhs[i].setNama(JOptionPane.showInputDialog("Masukan Nama Mahasiswa ke-" + (i + 1)));
            mhs[i].setNim(JOptionPane.showInputDialog("Masukan Nim Dari Mahasiswa " + mhs[i].getNama()));
            mhs[i].setJurusan(JOptionPane.showInputDialog("Masukan Jurusan Dari Mahasiswa " + mhs[i].getNama()));
        }
        System.out.printf("%25s\n","Data Mahasiswa");
        System.out.println("=======================================");
        System.out.printf("|%-5s|%-15s|%-15s|\n", "No", "Nama", "Nim", "Jurusan");
        System.out.println("=======================================");
        for (int i = 0; i < mhs.length; i++) {
            System.out.printf("|%-5s|%-15s|%-15s|\n", (i + 1), mhs[i].getNama(), mhs[i].getNim(), mhs[i].getJurusan());

        }
        System.out.println("=======================================");
    }
}
