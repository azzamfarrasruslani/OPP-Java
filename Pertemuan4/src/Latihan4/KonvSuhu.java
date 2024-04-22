package Latihan4;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;

public class KonvSuhu {

    double suhu;

    public KonvSuhu(double suhu) {
        this.suhu = suhu;
    }

    public double CKeR() {
        return suhu * 4 / 5;
    }

    public double CKeF() {
        return (suhu * 9 / 5) + 32;
    }

    public double RKeC() {
        return suhu * 5 / 4;
    }

    public double RKeF() {
        return (suhu * 9 / 4) + 32;
    }

    public double FKeC() {
        return (suhu - 32) * 5 / 9;
    }

    public double FKeR() {
        return (suhu - 32) * 4 / 9;
    }

    public void info() {
        System.out.println("Celcius ke Reamur : " + CKeR());
        System.out.println("Celcius ke Fahrenheit : " + CKeF());
        System.out.println("Reamur ke Celcius : " + RKeC());
        System.out.println("Reamur ke Fahrenheit : " + RKeF());
        System.out.println("Fahrenheit ke Celcius :" + FKeC());
        System.out.println("Fahrenheit ke Reamur :" + FKeR());
    }

    public static void main(String[] args) {
        double inputSuhu = Double.parseDouble(JOptionPane.showInputDialog("Masukan suhu"));
        KonvSuhu konversi = new KonvSuhu(inputSuhu);
        
        konversi.info();

    }
}
