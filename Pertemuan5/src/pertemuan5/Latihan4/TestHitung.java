package pertemuan5.Latihan4;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;
public class TestHitung {
    public static void main(String[] args) {
        double bil1 = Double.parseDouble(JOptionPane.showInputDialog("Masukan Bilangan 1"));
        int bil2 = Integer.parseInt(JOptionPane.showInputDialog("Masukan Bilangan 2"));
        
        Hitung penjumlh = new Hitung(bil1, bil2);
        penjumlh.info();
        
    }
 
}
