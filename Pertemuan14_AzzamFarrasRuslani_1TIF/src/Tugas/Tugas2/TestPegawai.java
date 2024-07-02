package Tugas.Tugas2;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TestPegawai {
    public static void main(String[] args) {
        PegawaiTetap pgt1 = new PegawaiTetap( "Tono", "Pegawai tetap", 4000000);
        System.out.println(pgt1.toString());
        System.out.println();
        PegawaiKontrak pgk1 = new PegawaiKontrak(10, "Tanu", "Pegawai kontrak", 2000000);
        System.out.println(pgk1.toString());
        
        

    }
}
