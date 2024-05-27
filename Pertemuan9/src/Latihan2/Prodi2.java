package Latihan2;

/**
 *
 * @author Admin
 */
public class Prodi2 {

    String kodeProdi;
    String namaProdi;
    int jumlahMhs;
    public Mahasiswa2[] mhs;

    public Prodi2(String kodeProdi, String namaProdi, int jumlahMhs) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
        this.jumlahMhs = jumlahMhs;
        this.mhs = new Mahasiswa2[jumlahMhs];
    }

     void tambahMahasiswa(Mahasiswa2 mahasiswa, int index) {
        if (index >= 0 && index < jumlahMhs) {
            mhs[index] = mahasiswa;
        }
    }

}
