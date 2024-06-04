package Latihan6;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Nilai {
    private Matakuliah matkul;
    private double nilai;

    public Nilai(Matakuliah matkul, double nilai) {
        this.matkul = matkul;
        this.nilai = nilai;
    }

    public Matakuliah getMatakuliah() {
        return matkul;
    }

    public double getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return "Matakuliah: [" + matkul.toString() + "], Nilai: " + nilai;
    }
}
