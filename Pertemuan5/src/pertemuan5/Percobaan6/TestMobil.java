package pertemuan5.Percobaan6;

import Pertemuan5.Percobaan6.MobilLain;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TestMobil {

    public static void main(String[] args) {
        MobilLain m1 = new MobilLain();
        MobilLain m2 = new MobilLain();

        m1.setMerek("Toyota");
        m1.setWarna("Hitam");

        m2.setMerek("Kijang");
        m2.setWarna("Merah");

        m1.getMerek();
        
        
        System.out.println(m1.getMerek());
        System.out.println(m1.getWarna());
        
        System.out.println(m2.getMerek());
        System.out.println(m2.getWarna());
        

    }
}
