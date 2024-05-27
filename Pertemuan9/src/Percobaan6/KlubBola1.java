package Percobaan6;

/**
 *
 * @author Admin
 */
public class KlubBola1 {

    String namaKlub;
    PemainBola1 daftar[] = new PemainBola1[11];
    int jmlPemain = 0;

    public KlubBola1(String namaKlub) {
        this.namaKlub = namaKlub;
    }
    
    public void addPemain (PemainBola1 p) {
       this.daftar[jmlPemain] = p;
       this.jmlPemain++;
    }
    
    public void addPemain (String nama, String alamat) {
        PemainBola1 p = new PemainBola1(nama, alamat);
        this.daftar[jmlPemain] = p;
        this.jmlPemain++;
    }
    
    public void displayPemain () {
        int i;
        System.out.println("Nama Klub : " + this.namaKlub);
        System.out.println("Daftar Pemain : ");
        System.out.println("No\t" + "Nama\t" + "Alamat");
        for (int j = 0; j < jmlPemain; j++) {
            System.out.println((j+1) + ". \t" + daftar[j].nama 
                    + "\t" + daftar[j].alamat);
        }
    }
}
