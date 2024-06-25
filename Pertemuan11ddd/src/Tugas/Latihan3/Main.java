package Tugas.Latihan3;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Main {
    public static void main(String[] args) {
        
        
        PegawaiTetap pgt1 = new PegawaiTetap("Tono Surjono", "Pegawai Tetap", 4000000, 500000, 
                50000, 10);
        
        pgt1.infoPegawai();
        
        PegawaiKontrak pgk1 = new PegawaiKontrak("Tanu Wibowo", "Pegawai Kontrak", 
                3000000, 10000000, 50000, 10);
        
        System.out.println();
         pgk1.infoPegawai();
         
          pgk1.hitBonusProject();
    }
 
}
