package Latihan2;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class AsosiasiPersegiKubus {

    public static void main(String[] args) {
        Persegi persegi = new Persegi(2);

        Kubus kubus = new Kubus();
        System.out.println("Persegi");
        System.out.println("Sisi Persegi : " + persegi.getSisi());
        System.out.println("Luas Persegi : " + persegi.hitLuasPersegi());
        System.out.println("Keliling Persegi : " + persegi.hitKelPersegi());

        System.out.println();

//        kubus uses sisi persegi
        System.out.println("Kubus");
        kubus.setSisi(persegi.getSisi());
        System.out.println("Sisi Kubus : " + kubus.getSisi());
        System.out.println("Volume Kubus = " + kubus.hitVolumeKubus());
        System.out.println("Luas Permukaan Kubus = " + kubus.hitLuasPermukaanKubus());
    }

}
