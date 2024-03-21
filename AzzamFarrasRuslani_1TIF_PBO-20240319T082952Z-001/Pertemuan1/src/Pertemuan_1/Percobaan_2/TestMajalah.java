package Pertemuan_1.Percobaan_2;

/**
 *
 * @author lab25601
 */
public class TestMajalah {
    public static void main(String[] args) {
        Majalah m1 = new Majalah ();
        Majalah m2 = new Majalah ();
        Majalah s1 = new Majalah ();
        Majalah s2 = new Majalah ();

        m1.nama = "Tempo";
        m2.nama = "Aneka Yes";
        
        m1.info();
        m2.info();

        s1.jenis ="Majalah remaja";
        s2.jenis = "Majalah fasion";
        
        m1.spesialisasi("Berita");
        m2.spesialisasi("Fashion");

        s1.spesialisasi();
        s2.spesialisasi();


    }
}
