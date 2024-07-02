package AbstractClass.Percobaan2;

import AbstractClass.Percobaan2.Hewan;

/**
 *
 * @author Admin
 */
public class Anjing extends Hewan{
     private String nama;
    
    Anjing (String nama) {
        super("Anjing");
        this.nama= nama;
    }
    
    @Override
    public void suara() {
        System.out.println("Menggong gong.. ");
    }
    
     @Override
    public String toString(){
        return super.toString()+" " + nama;
    }
}
