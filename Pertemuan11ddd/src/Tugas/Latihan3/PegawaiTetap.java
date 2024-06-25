package Tugas.Latihan3;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class PegawaiTetap extends Pegawai {

    double tunjangan, bonusLembur;
    int jmlJamLembur;

    public PegawaiTetap(String namaPegawai, String jenisPegawai, double gajiPokok,
             double tunjangan, double bonusLembur, int jmlJamLembur) {
        super(namaPegawai, jenisPegawai, gajiPokok);
        this.tunjangan = tunjangan;
        this.bonusLembur = bonusLembur;
        this.jmlJamLembur = jmlJamLembur;
    }

    @Override
    public double hitTotPenghasilan() {
        return gajiPokok + tunjangan + (bonusLembur * jmlJamLembur);
    }

    @Override
    public void infoPegawai() {
        System.out.println("Nama pegawai : " + namaPegawai);
        System.out.println("Jenis Pegawai : " + jenisPegawai);
        System.out.println("Total Penghasilan : " + hitTotPenghasilan());
    }
}
