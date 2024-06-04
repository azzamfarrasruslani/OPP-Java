package Latihan1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TestBangunRuang {

    public static void main(String[] args) {

        Kubus kubus = new Kubus(4);

        Balok balok = new Balok(2, 3, 4);
        
        BangunRuang bangunruang = new BangunRuang(kubus, balok);
        
        
        System.out.println("Info Kubus");
        bangunruang.infoKubus();
        
        System.out.println("Info Balok");
        bangunruang.infoBalok();
    }

}
