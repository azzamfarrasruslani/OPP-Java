package Tugas.Latihan1;

/**
 *
 * @author Admin
 */
public class TestBangunDatar {

    public static void main(String[] args) {
        Segitiga s1 = new Segitiga();
        Segitiga s2 = new Segitiga();

        s1.nama = "Siku-siku";
        s1.alas = 10;
        s1.tinggi = 15;

        System.out.println("Nama Segitiga: " + s1.nama);
        System.out.println("Luas Segitiga: " + s1.luas());

        System.out.println("");
        s2.nama = "Sama sisi";
        s2.sisi1 = s2.sisi2 = s2.sisi3 = 100;
        System.out.println("Nama Segitiga: " + s2.nama);
        System.out.println("Keliling Segitiga: " + s2.keliling());

        Persegi p1 = new Persegi();
        p1.nama = "Persegi";
        p1.sisi = 2;
        System.out.println();
        System.out.println("Nama Bangun Datar : " + p1.nama);
        System.out.println("Luas Persegi : " + p1.luas());
        System.out.println("Keliling Persegi : " + p1.keliling());

        Lingkaran ling1 = new Lingkaran();
        ling1.nama = "Lingaran";
        ling1.jari = 2;
        System.out.println();
        System.out.println("Nama Bangun Datar : " + ling1.nama);
        System.out.println("Luas Lingkaran : " + ling1.luas());
        System.out.println("Keliling Lingkaran : " + ling1.keliling());
    }

}
