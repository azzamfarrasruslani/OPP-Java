package Latihan4;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;
public class Bmi {
    double tinggi, berat;
    
    public Bmi (double tinggi, double berat) {
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public double hitBmi () {
        return berat / (tinggi * tinggi);
    }
    
    
    public String kategori () {
        String ket;
        if (hitBmi() < 18.5) {
            ket = "Berat Badan kurang";
        } else if (hitBmi() >= 18.5 && hitBmi() < 25 ) {
            ket = "Berat Badan Normal";
        } else if (hitBmi() >= 25 && hitBmi() < 29.9) {
            ket = "Berat Badan Berlebih";
        } else  {
            ket = "Obesitas";
        }
        return ket;
    }
    
    public static void main(String[] args) {
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukan Tinggi Badan"));
        double berat = Double.parseDouble(JOptionPane.showInputDialog("Masukan Berat Badan"));
        Bmi orang = new Bmi(tinggi, berat);
        
        System.out.println("Tinggi : " + orang.tinggi );
        System.out.println("Berat : " + orang.berat);
        System.out.println("Ukuran BMI : " + orang.hitBmi());
        System.out.println("Kategori : " + orang.kategori());
    }
}
