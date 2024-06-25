package Tugas.Latihan3;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class PegawaiKontrak extends Pegawai {

    double bonusProject, nilaiProject, bonusLembur;
    int jmlJamLembur;

    public PegawaiKontrak(String namaPegawai, String jenisPegawai, double gajiPokok,
            double nilaProject, double bonusLembur, int jmlJamLembur) {
        super(namaPegawai, jenisPegawai , gajiPokok);
        this.bonusLembur = bonusLembur;
        this.nilaiProject = nilaProject;
        this.jmlJamLembur = jmlJamLembur;
        
    }
    
    public double hitBonusProject () {
        bonusProject = nilaiProject * 0.002;
        return bonusProject;         
    }
 
    @Override
    public double hitTotPenghasilan() {
        return gajiPokok + (bonusLembur * jmlJamLembur) + hitBonusProject();
    }

    @Override
    public void infoPegawai() {
        System.out.println("Nama pegawai : " + namaPegawai);
        System.out.println("Jenis Pegawai : " + jenisPegawai);
        System.out.println("Total Penghasilan : " + hitTotPenghasilan());
    }

}
