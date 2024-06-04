package Latihan3;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Main {

    public static void main(String[] args) {
        String namaProdi, kodeProdi;
        String nim, nama;
        int jmlMahasiswa;

        Prodi[] prodi = new Prodi[2];
        Jurusan jurusan = new Jurusan("Jurusan Teknologi Informasi", "JTI", 2);

        // Input data prodi
        for (int i = 0; i < prodi.length; i++) {
            namaProdi = JOptionPane.showInputDialog("Masukan nama prodi ke- " + (i + 1));
            kodeProdi = JOptionPane.showInputDialog("Masukan kode prodi ke- " + (i + 1));
            jmlMahasiswa = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah mahasiswa"));
            prodi[i] = new Prodi(namaProdi, kodeProdi, jmlMahasiswa);
            jurusan.tambahProdi(prodi[i], i);
        }

        // Output data jurusan
        jurusan.tampilInfoJurusan();

        // Input dan output data prodi dan mahasiswa
        for (int i = 0; i < prodi.length; i++) {
            System.out.println("Data Prodi " + jurusan.prodi[i].namaProdi);
            jurusan.prodi[i].tampilInfoProdi();
            System.out.println();

            // Input data mahasiswa
            for (int j = 0; j < jurusan.prodi[i].jmlMahasiswa; j++) {
                nim = JOptionPane.showInputDialog("Masukan NIM mahasiswa prodi " + jurusan.prodi[i].namaProdi + " ke-" + (j + 1));
                nama = JOptionPane.showInputDialog("Masukan nama mahasiswa prodi " + jurusan.prodi[i].namaProdi + " ke-" + (j + 1));
                Mahasiswa mhs = new Mahasiswa(nim, nama);
                jurusan.prodi[i].tambahMahasiswa(mhs, j);
            }

            // Output data mahasiswa
            System.out.println("Data Mahasiswa Prodi " + jurusan.prodi[i].namaProdi);
            System.out.println("NIM" + "\tNama");
            for (int j = 0; j < jurusan.prodi[i].mhs.length; j++) {
                System.out.println(jurusan.prodi[i].mhs[j].nim + "\t" + jurusan.prodi[i].mhs[j].nama);
            }
            System.out.println();
        }
    }
}
