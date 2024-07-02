package Tugas.Tugas2;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class PegawaiTetap extends Pegawai{
     protected double tunjangan ;

    public PegawaiTetap(String nama, String jenisPegawai, int gaji) {
        super(nama, jenisPegawai, gaji);
        this.tunjangan = 500000;
    }
    
    @Override
       public  double getTotPenhasilan() {
           return gaji + tunjangan;
       }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
       
       
}
