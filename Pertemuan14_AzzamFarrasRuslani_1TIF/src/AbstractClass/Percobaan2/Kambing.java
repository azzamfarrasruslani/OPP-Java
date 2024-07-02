package AbstractClass.Percobaan2;

import AbstractClass.Percobaan2.Hewan;

/**
 *
 * @author Admin
 */
public class Kambing extends Hewan{
       private String nama;
    
    Kambing (String nama) {
        super("Kambing");
        this.nama= nama;
    }
    
    @Override
    public void suara() {
        System.out.println("Mengembik.. ");
    }
    
    public String toString(){
        return super.toString()+" " + nama;
    }
}
