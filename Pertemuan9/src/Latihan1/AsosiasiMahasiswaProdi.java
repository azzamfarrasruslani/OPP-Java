package Latihan1;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class AsosiasiMahasiswaProdi {

    public static void main(String[] args) {

        //Object Mahasiswa
        Mahasiswa mhs[] = new Mahasiswa[10];

        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
        }

        for (int i = 0; i < mhs.length; i++) {
            mhs[i].setNim(JOptionPane.showInputDialog("Masukan Nim Mahasiswa ke-" + (i + 1)));
            mhs[i].setNama(JOptionPane.showInputDialog("Masukan Nama Mahasiswa ke-" + (i + 1)));
        }

        //Objeck Prodi
        Prodi tet = new Prodi();
        tet.setKodeProdi("TET");
        tet.setNamaProdi("Teknik Telekomunikasi");

        //Hubungan antara prodi dengan mahasiswa
        System.out.println("*Data Prodi Teknik Telekomunikasi");
        for (int i = 0; i < mhs.length; i++) {
            tet.setDataMhs(mhs[i].getNim(), mhs[i].getNama());
        }
        System.out.println("Kode Prodi : " + tet.getKodeProdi());
        System.out.println("Nama Prodi : " + tet.getNamaProdi());
        System.out.println("Jumlah Mahasiswa : " + tet.getJumlahMhs());
        System.out.println("Nim"+"\tNama");
        for (int i = 0; i < mhs.length; i++) {
            System.out.println(tet.getDataMhs(i));
        }

    }

}
