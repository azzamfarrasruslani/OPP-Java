package Percobaan6;

/**
 *
 * @author Admin
 */
public class PemainBolaKlubBola1 {
    public static void main(String[] args) {
        //Klub 1
        PemainBola1 p1 = new PemainBola1("David", "Jl. Umban Sari");
        PemainBola1 p2 = new PemainBola1("Daniel", "Jl. Kembang Sari");
        KlubBola1 klub1 = new KlubBola1("Mu");
        
        klub1.addPemain(p1);
        klub1.addPemain(p2);
        klub1.displayPemain();
        
        
        //Klub 2
        KlubBola1 klub2 = new KlubBola1("Chelsea");
        PemainBola1 p3 = new PemainBola1("Oman", "Jl. Umban Sari");
        PemainBola1 p4 = new PemainBola1("Stephen","Jl. Kembang Sari");
        
        
        klub2.addPemain(p3);
        klub2.addPemain(p4);
        klub2.addPemain("Idris", "Jl. Yos");
        
        System.out.println();
        klub2.displayPemain();
        
        
    }
}
