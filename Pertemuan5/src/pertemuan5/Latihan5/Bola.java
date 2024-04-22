package pertemuan5.Latihan5;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Bola {

    private int jari= 4;
    private String jenis = "Bola Pimpong";
    
    public Bola (int jari, String jenis) {
        this.jari = jari;
        this.jenis= jenis;
    }
    public int getJari() {
        return jari;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public double volumBola () {
        return (4.0 / 3.0) * Math.PI * Math.pow(jari, 3);
    }
    
}
