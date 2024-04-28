package Percobaan4;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class PenumpangPesawat {

    private String nama, jk, tujuan, kelas;

    public PenumpangPesawat() {
        this.nama = "";
        this.jk = "";
        this.tujuan = "";
        this.kelas = "";
    }

    public PenumpangPesawat(String nama, String jk, String tujuan, String kelas) {
        this.nama = nama;
        this.jk = jk;
        this.tujuan = tujuan;
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

}
