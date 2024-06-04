package Latihan1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class BangunRuang {

    public Kubus kubus;
    public Balok balok;

    public BangunRuang(Kubus kubus, Balok balok) {
        this.kubus = kubus;
        this.balok = balok;
    }

    public double getVolKubus() {
        return kubus.hitVolumeKubus();
    }

    public double getVolBalok() {
        return balok.hitVolumeBalok();
    }

    public double getLuasPerKubus() {
        return kubus.hitLuasPermukaanKubus();
    }

    public double getLuasPerBalok() {
        return balok.hitLuasPermukaanBalok();
    }

    public void infoKubus() {
        System.out.println("Volume Kubus = " + kubus.hitVolumeKubus());
        System.out.println("Luas Permukaan Kubus = " + kubus.hitLuasPermukaanKubus());
        System.out.println();
    }

    public void infoBalok() {
        System.out.println("Volume Balok = " + balok.hitVolumeBalok());
        System.out.println("Luas Permukaan Balok = " + balok.hitLuasPermukaanBalok());
        System.out.println();
    }
}
