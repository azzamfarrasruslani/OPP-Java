package Percobaan1;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class TestMobil {

    public static void main(String[] args) {
        Mobil mb[] = new Mobil[5];
        String wrn,merk;
        for (int i = 0; i < mb.length; i++) {
//            mb[i] = new Mobil(mb[i].getWrn(), mb[i].getMerk());           
            mb[i] = new Mobil("hgtju", "hgg");
        }

        for (int i = 0; i < mb.length; i++) {
            mb[i].setData();
        }

        for (int i = 0; i < mb.length; i++) {
            mb[i].info();

        }
    }
}
