package AbstractClass.Percobaan2;

/**
 *
 * @author Admin
 */
public abstract class Hewan {
    private String jenis;
    Hewan(String jenis) {
        this.jenis = jenis;
    }
    protected abstract void suara(); //deklarasi, tidak di defenisiskan
            
    public String toString() {
        return "Seekor " + jenis;
    }        
}
