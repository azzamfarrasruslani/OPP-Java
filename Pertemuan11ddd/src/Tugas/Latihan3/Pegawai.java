package Tugas.Latihan3;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Pegawai {
    String namaPegawai;
    String jenisPegawai;
    double gajiPokok;
    
    
    public Pegawai (String namaPegawai, String jenisPegawai, double gajiPokok) {
        this.namaPegawai = namaPegawai;
        this.jenisPegawai = jenisPegawai;
        this.gajiPokok = gajiPokok;
    }
    
    public double hitTotPenghasilan () {
        return gajiPokok;
    }
    
    public void infoPegawai () {
        System.out.println("Nama pegawai : " + namaPegawai);
        System.out.println("Jenis Pegawai : " + jenisPegawai);
        System.out.println("Total Penghasilan : " + hitTotPenghasilan());
    } 
}
