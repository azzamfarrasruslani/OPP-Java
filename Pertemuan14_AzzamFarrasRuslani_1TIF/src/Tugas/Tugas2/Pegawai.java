package Tugas.Tugas2;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public abstract class Pegawai {
    protected String nama;
    protected String jenisPegawai;
    protected int gaji;

    public Pegawai(String nama, String jenisPegawai, int gaji) {
        this.nama = nama;
        this.jenisPegawai = jenisPegawai;
        this.gaji = gaji;
    }
    
    public abstract double getTotPenhasilan();

    @Override
    public String toString() {
        return "nama : " + nama + "\njenis pegawai : "
                + jenisPegawai + "\ntotal gaji : " + getTotPenhasilan();
    }
    
    
}
