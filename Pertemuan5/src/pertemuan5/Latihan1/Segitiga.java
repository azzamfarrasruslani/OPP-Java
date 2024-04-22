package pertemuan5.Latihan1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Segitiga {

    private double sisi;

    public Segitiga() {
       sisi = 0;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public double luas() {
        return (sisi * sisi * Math.sqrt(3)) / 4;
    }

    public double kel() {
        return  3 * sisi;
    }
    
    public void info () {
        System.out.print("Luas segitiga sama sisi : ");
        System.out.println(String.format("%.2f", luas()));
        System.out.println("Keliling segitiga sama sisi : "  + kel());
    }

}
