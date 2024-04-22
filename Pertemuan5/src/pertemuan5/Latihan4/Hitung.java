package pertemuan5.Latihan4;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Hitung {
    double bil1 ;
    int bil2;
    
    public Hitung (double bil1, int bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    public double tambah () {
        return bil1 + bil2;
    }
    
    public double kurang () {
        return bil1 - bil2;
    }
    
    public void info () {
        System.out.println("Hasil Penjumlahan : " + tambah());
        System.out.println("Hasil Pengurangan : " + kurang());
    }
    
}
