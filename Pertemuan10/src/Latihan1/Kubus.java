package Latihan1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Kubus {

    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitLuasPermukaanKubus() {
        return 6 * (sisi * sisi);
    }
    
    public double hitVolumeKubus () {
        return sisi * sisi * sisi;
    }
    
    
}
