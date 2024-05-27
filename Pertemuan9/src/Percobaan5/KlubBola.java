package Percobaan5;

/**
 *
 * @author Admin
 */
public class KlubBola {
  private String namaKlub;
  private PemainBola pemain;

    public KlubBola(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public KlubBola(String namaKlub, PemainBola pemain) {
        this.namaKlub = namaKlub;
        this.pemain = pemain;
    }

    public String getNamaKlub() {
        return namaKlub;
    }

    public void setNamaKlub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public String getNamaPemain() {
        return pemain.getNama();
    }
    
    public void setNamaPemain (String pemain) {
        this.pemain.setNama(pemain);
    }
    
    public String getAlamatPemain() {
        return pemain.getAlamat();
    }
    
    public void setAlamatPemain (String alamat) {
        this.pemain.setAlamat(alamat);
    }
    
    public void setPemain (String nama, String alamat) {
        pemain = new PemainBola(nama, alamat);
    } 
  
  
}
