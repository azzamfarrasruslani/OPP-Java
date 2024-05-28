package Latihan2;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class AsosiasiMahasiswaProdi2 {

    public static void main(String[] args) {
        String nim, nama;
        
        //Object Mahasiswa
        Mahasiswa2 mhs[] = new Mahasiswa2[2];
//        Object Prodi
        Prodi2 prodi = new Prodi2("TET", "Teknik Telekomunikasi", 2);

        for (int i = 0; i < mhs.length; i++) {
            nim = JOptionPane.showInputDialog("Masukan nim mahasiswa ke-" + (i + 1));
            nama = JOptionPane.showInputDialog("Masukan nama mahasiswa ke-" + (i + 1));
            mhs[i] = new Mahasiswa2(nim, nama);
            prodi.tambahMahasiswa(mhs[i], i);
        }

        System.out.println("*Data Prodi Teknik Telekomunikasi");
        for (int i = 0; i < 1; i++) {
            System.out.println("Kode Prodi : " + prodi.kodeProdi);
            System.out.println("Nama Prodi : " + prodi.namaProdi);
            System.out.println("Jumlah Mahasiswa : " + prodi.jumlahMhs);
        }
        System.out.println("Nim" + "\tNama");
        for (int i = 0; i < mhs.length; i++) {
            System.out.println(prodi.mhs[i].nim + "\t" + prodi.mhs[i].nama);
        }

    }
}
