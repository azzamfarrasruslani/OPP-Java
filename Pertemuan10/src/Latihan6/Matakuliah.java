package Latihan6;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Matakuliah {

    private String kodeMatkul;
    private String namaMatkul;
    private int sks;

    public Matakuliah(String kode, String nama, int sks) {
        this.kodeMatkul = kode;
        this.namaMatkul = nama;
        this.sks = sks;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString() {
        return "Kode: " + kodeMatkul + ", Nama: " + namaMatkul + ", SKS: " + sks;
    }
}
