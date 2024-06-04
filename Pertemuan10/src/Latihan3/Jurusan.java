package Latihan3;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Jurusan {

    String namaJurusan, kodeJurusan;
    public Prodi prodi[];
    int jmlprodi;

    public Jurusan(String namaJurusan, String kodeJurusan, int jmlProdi) {
        this.namaJurusan = namaJurusan;
        this.kodeJurusan = kodeJurusan;
        this.jmlprodi = jmlProdi;
        this.prodi = new Prodi[jmlProdi];
    }

    public void tambahProdi(Prodi prd, int index) {
        if (index >= 0 && index < jmlprodi) {
            prodi[index] = prd;
        }
    }

    public void tampilInfoJurusan() {
        System.out.println("Data " + namaJurusan);
        System.out.println("Kode Jurusan : " + kodeJurusan);
        System.out.println("Jumlah prodi : " + jmlprodi);
        System.out.println();
    }

}
