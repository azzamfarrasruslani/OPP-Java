package Latihan2;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Kubus {

    private double sisi;


    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitLuasPermukaanKubus() {
        return 6 * (sisi * sisi);
    }

    public double hitVolumeKubus() {
        return sisi * sisi * sisi;
    }
}
