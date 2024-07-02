package AbstractClass.Percobaan2;

import AbstractClass.Percobaan2.Hewan;

/**
 *
 * @author Admin
 */
public class Burung extends Hewan{
    private String nama;
    
    Burung (String nama) {
        super("Burung");
        this.nama= nama;
    }
    
    @Override
    public void suara() {
        System.out.println("Berkicau");
    }
    
    @Override
    public String toString(){
        return super.toString()+" " + nama;
    }
    
}
