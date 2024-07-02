package AbstractClass.Percobaan1;

/**
 *
 * @author Admin
 */
public class PersegiPanjang extends Pola{
    private int panjang, lebar;
    
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double getLuas() {
        return panjang * lebar;
    }
    
    public String toString() {
        return "persegi panjang";
    }
}
