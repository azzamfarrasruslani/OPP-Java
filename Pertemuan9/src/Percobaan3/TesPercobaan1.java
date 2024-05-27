package Percobaan3;

/**
 *
 * @author Admin
 */
public class TesPercobaan1 {

    public static void main(String[] args) {
        //Objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa();
        m1.setNim("102021");
        m1.setNama("Atika Kaysa");

        //Objek mahasiswa
        Mahasiswa m2 = new Mahasiswa();
        m2.setNim("102022");
        m2.setNama("Dito Faturrahman");
        
        Mahasiswa m3 = new Mahasiswa();
        m3.setNim("102022");
        m3.setNama("Dito Faturrahman");
        
        //Objek Dosen
        Dosen d = new Dosen();
        d.setKodeDosen("PJH");
        
        //Hubungan antar dosen dan mahasiswa
        d.setNimMhs(m1.getNim());
        d.setNimMhs(m2.getNim());
      
        
        
        System.out.println("Dosen : ");
        System.out.println("Kode Dosen : " + d.getKodeDosen());
        System.out.println("Jumlah Mahasiswa : " + d.getJumlahMhs());
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Nim mahasiswa " + d.getNimMhs(i));
            
        }
    }
}
