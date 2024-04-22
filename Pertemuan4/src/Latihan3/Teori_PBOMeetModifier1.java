package Latihan3;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Teori_PBOMeetModifier1 {

    private double bil1, bil2;

    public Teori_PBOMeetModifier1(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    protected double tambah() {
        return bil1 + bil2;
    }

    public double kurang() {
        return bil1 - bil2;
    }

    public double kali() {
        return bil1 * bil2;
    }

    public double bagi() {
        if (bil2 == 0) {
            System.out.println("Tidak bisa dibagi nol");
            System.exit(0);
        }
        return bil1 / bil2;
    }
}
