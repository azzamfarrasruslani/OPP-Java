package Pertemuan4.Lat2;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Lingkaran {
   double jari;
   double pi = 3.14;
   String warna;
   double luas;
   double kel;
   
   public Lingkaran(double jari, String warna) {
       this.jari = jari;
       this.warna = warna;
       this.luas = hitungLuas();
       this.kel = hitungKeliling();
   }
   
   private double hitungLuas() {
       return pi * jari * jari;
   }
   
   private double hitungKeliling() {
       return 2 * pi * jari;
   }
   
   public void infoLingkaran() {
       System.out.println("Jari-jari : " + jari);
       System.out.println("Warna : " + warna);
       System.out.println("Luas : " + luas);
       System.out.println("Keliling : " + kel);
   }  
}
