package pertemuan5.Latihan6;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Tiket {

    private String maskapai, noKursi, berangkat, tglTerbang;

    public Tiket(String maskapai, String noKursi, String berangkat, String tglTerbang) {
     this.maskapai = maskapai;
     this.noKursi = noKursi;
     this.berangkat= berangkat;
     this.tglTerbang = tglTerbang; 
    }

    public String getMaskapai() {
        return maskapai;
    }

    public String getNoKursi() {
        return noKursi;
    }

    public String getBerangkat() {
        return berangkat;
    }

    public String getTglTerbang() {
        return tglTerbang;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public void setNoKursi(String noKursi) {
        this.noKursi = noKursi;
    }

    public void setBerangkat(String berangkat) {
        this.berangkat = berangkat;
    }

    public void setTglTerbang(String tglTerbang) {
        this.tglTerbang = tglTerbang;
    }

    
}
