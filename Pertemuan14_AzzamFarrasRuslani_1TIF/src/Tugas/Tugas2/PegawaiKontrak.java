package Tugas.Tugas2;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class PegawaiKontrak extends Pegawai{

    protected double uangLembur;
    protected int jmlJamLembur;

    public PegawaiKontrak(int jmlJamLembur, String nama, String jenisPegawai, int gaji) {
        super(nama, jenisPegawai, gaji);
        this.uangLembur = 30000;
        this.jmlJamLembur = jmlJamLembur;
    }

    
    @Override
       public  double getTotPenhasilan() {
           return gaji + (jmlJamLembur * uangLembur);
       }
       
       @Override
    public String toString() {
        return super.toString(); 
    }
    

}
