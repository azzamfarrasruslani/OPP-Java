package Percobaan4;

/**
 *
 * @author Admin
 */
public class KlubBola1 {

    String namaKlub;
    PemainBola1 pemain;

    public KlubBola1(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public KlubBola1(String namaKlub, PemainBola1 pemain) {
        this.namaKlub = namaKlub;
        this.pemain = pemain;
    }
    
    public void setPemain(String nama, String alamat) {
        pemain = new PemainBola1(nama, alamat);
    }
}
