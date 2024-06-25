package Tugas.Latihan1;

/**
 *
 * @author Admin
 */
public class Lingkaran extends BangunDatar{
    String nama;
    double jari;

    public Lingkaran(String nama, double jari) {
        this.nama = nama;
        this.jari = jari;
    }

    public Lingkaran() {
        this.jari = 0;
    }
    
      @Override
    public double luas() {
        super.luas();
        return Math.PI * jari * jari;
    }
    
    @Override
    public double keliling() {
        super.keliling();
        return 2 * Math.PI * jari;
    }
    
    
}
