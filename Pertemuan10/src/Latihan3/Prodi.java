package Latihan3;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Prodi {

    public Mahasiswa[] mhs;
    String namaProdi, kodeProdi;
    int jmlMahasiswa;

    public Prodi(String namaProdi, String kodeProdi, int jmlMahasiswa) {
        this.namaProdi = namaProdi;
        this.kodeProdi = kodeProdi;
        this.jmlMahasiswa = jmlMahasiswa;
        this.mhs = new Mahasiswa[jmlMahasiswa];
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa, int index) {
        if (index >= 0 && index < jmlMahasiswa) {
            mhs[index] = mahasiswa;
        }
    }

    public void tampilInfoProdi() {
        System.out.println("Nama Prodi: " + namaProdi);
        System.out.println("Kode Prodi: " + kodeProdi);
        System.out.println("Jumlah Mahasiswa: " + jmlMahasiswa);
    }
}
