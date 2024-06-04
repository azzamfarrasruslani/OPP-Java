package Latihan5;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Kampus {

    String namaKampus;
    int jmlMhs, jmlDosen;
    public Mahasiswa mhs[];
    public Dosen dosen[];

    public Kampus(String namaKampus, int jmlMhs, int jmlDosen) {
        this.namaKampus = namaKampus;
        this.jmlMhs = jmlMhs;
        this.jmlDosen = jmlDosen;
        this.mhs = new Mahasiswa[jmlMhs];
        this.dosen = new Dosen[jmlDosen];
    }

    
    public void tampilInfoKampus () {
         System.out.println("Data Kampus " + namaKampus);
        System.out.println("Jumlah mahasiswa : " + jmlMhs);
        System.out.println("Jumlah dosen : " + jmlDosen);
    }


      
    
    
}
