package Tugas.Latihan1;

/**
 *
 * @author Admin
 */
public class Persegi extends BangunDatar {

    String nama;
    double  sisi;

    public Persegi(String nam) {
        this.nama = nama;
    }

    public Persegi() {
        this.sisi = 0;
    }

    @Override
    public double luas() {
        super.luas();
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        super.keliling();
        return 4 * sisi;
    }

}
