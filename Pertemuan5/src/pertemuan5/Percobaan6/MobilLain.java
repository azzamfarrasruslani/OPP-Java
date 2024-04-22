package Pertemuan5.Percobaan6;

/**
 *
 * @author Admin
 */
public class MobilLain {

    private String warna;
    private String merek;

    public MobilLain() {
        this.warna = "";
        this.merek = "";
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void beriWarna() {
        System.out.println("Warna mobil ini adalah " + getWarna());
    }

    public void beriMerek() {
        System.out.println("Merek mobil ini adalah " + getMerek());
    }
}
