package pertemuan5.Latihan1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;

public class TestSegitiga {

    public static void main(String[] args) {
        double sisi = Double.parseDouble(JOptionPane.showInputDialog("Masukan sisi segitiga"));
        Segitiga segSmaSisi = new Segitiga();
        segSmaSisi.setSisi(sisi);     
        segSmaSisi.info();
    }
}
