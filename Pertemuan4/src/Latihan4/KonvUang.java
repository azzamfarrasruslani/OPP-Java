package Latihan4;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;

public class KonvUang {

    double uang;

    public KonvUang(double uang) {
        this.uang = uang;
    }

    public double dollarToRupiah() {
        return uang * 16069.95;
    }

    public double dollarToRinggit() {
        return uang * 4.76;
    }

    public double dollarToEuro() {
        return uang * 0.94;
    }

    public double ringgitToRupiah() {
        return uang * 3360.64;
    }

    public double ringgitToDollar() {
        return uang * 0.209249;
    }

    public double ringgitToEuro() {
        return uang * 0.19649;
    }

    public double rupiahToDollar() {
        return uang * 0.000062;
    }

    public double rupiahToRinggit() {
        return uang * 0.000299781;
    }

    public double rupiahToEuro() {
        return uang * 0.00006;
    }

    public double EuroToRupiah() {
        return uang * 17088.62;
    }

    public double EuroToRinggit() {
        return uang * 5.07;
    }

    public double EuroToDollar() {
        return uang * 1.06;
    }

    public void info() {
        System.out.println("Dollar to Rupiah: " + dollarToRupiah());
        System.out.println("Dollar to Ringgit: " + dollarToRinggit());
        System.out.println("Dollar to Euro: " + dollarToEuro());
        System.out.println("Ringgit to Rupiah: " + ringgitToRupiah());
        System.out.println("Ringgit to Dollar: " + ringgitToDollar());
        System.out.println("Ringgit to Euro: " + ringgitToEuro());
        System.out.println("Rupiah to Dollar: " + rupiahToDollar());
        System.out.println("Rupiah to Ringgit: " + rupiahToRinggit());
        System.out.println("Rupiah to Euro: " + rupiahToEuro());
        System.out.println("Euro to Rupiah: " + EuroToRupiah());
        System.out.println("Euro to Ringgit: " + EuroToRinggit());
        System.out.println("Euro to Dollar: " + EuroToDollar());
    }

    public static void main(String[] args) {
        double inputUang = Double.parseDouble(JOptionPane.showInputDialog("Masukan Jumlah Uang"));

        KonvUang konversi = new KonvUang(inputUang);
        System.out.println("Jumlah Uang : " + inputUang);
        konversi.info();

    }
}
