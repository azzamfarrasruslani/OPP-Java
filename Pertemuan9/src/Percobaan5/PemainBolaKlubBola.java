package Percobaan5;

/**
 *
 * @author Admin
 */
public class PemainBolaKlubBola {

    public static void main(String[] args) {
        //Cara 1
        PemainBola p1 = new PemainBola("David", "Jl. Umban Sari");
        KlubBola klub1 = new KlubBola("MU", p1);
        
        System.out.println("Nama Klub: " + klub1.getNamaKlub());
        System.out.println("Nama Pemain: " + klub1.getNamaPemain());
        System.out.println("Nama Pemain: " + klub1.getAlamatPemain());
        
        //Cara 2
        KlubBola klub2 = new KlubBola("Chelsea");
        klub2.setPemain("George", "Jl. Paus");
        
        System.out.println();
        System.out.println("Nama Klub: " + klub2.getNamaKlub());
        System.out.println("Nama Pemain: " + klub2.getNamaPemain());
        System.out.println("Nama Pemain: " + klub2.getAlamatPemain());
    }
}
