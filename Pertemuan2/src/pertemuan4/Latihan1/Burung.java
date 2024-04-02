package Pertemuan4.Latihan1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Burung {

    String nama, jenis, warna, asal;

    public Burung(String nama, String jenis, String warna, String asal) {
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.asal = asal;
    }
    
    public void info() {
        System.out.println("Nama  Burung : " + nama);
        System.out.println("Jenis Burung : " + jenis);
        System.out.println("Warna Burung : " + warna);
        System.out.println("Asal Burung : " + asal);
    }
    
    public static void main(String[] args) {
        Burung burung1 = new Burung("Tono", "Jalak Bali", "Putih", "Bali");
        Burung burung2 = new Burung("Tina", "Elang Jawa", "Coklat", "Jawa");
        
        burung1.info();
        burung2.info();
    }
}
