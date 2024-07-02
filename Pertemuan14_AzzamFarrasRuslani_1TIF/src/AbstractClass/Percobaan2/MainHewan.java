package AbstractClass.Percobaan2;


/**
 *
 * @author Admin
 */
public class MainHewan {

    public static void main(String[] args) {
        Burung b1 = new Burung("Tono");

        System.out.println(b1.toString());
        b1.suara();
        
        System.out.println();
        
        Kucing k1 = new Kucing("Subarjo");
        System.out.println(k1.toString());
        k1.suara();
        
        System.out.println();
        
        Anjing anj1 = new Anjing("Tina");
        System.out.println(anj1.toString());
        anj1.suara();
        
        System.out.println();
        
        Kambing kmb1 = new Kambing("Anto");
        System.out.println(kmb1.toString());
        kmb1.suara();

    }
}
