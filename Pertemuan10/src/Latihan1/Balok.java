package Latihan1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Balok {

    double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitLuasPermukaanBalok() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public double hitVolumeBalok() {
        return panjang * lebar * tinggi;
    }

}
