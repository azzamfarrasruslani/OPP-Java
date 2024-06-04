package Latihan2;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Persegi {

    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public double hitLuasPersegi() {
        return sisi * sisi;
    }

    public double hitKelPersegi() {
        return 4 * sisi;
    }
}
