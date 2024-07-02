package AbstractClass.Percobaan2;

import AbstractClass.Percobaan2.Hewan;

/**
 *
 * @author Admin
 */
public class Kucing extends Hewan{
      private String nama;
    
    Kucing (String nama) {
        super("Kucing");
        this.nama= nama;
    }
    
    @Override
    public void suara() {
        System.out.println("Mengeong.. ");
    }
    
      @Override
    public String toString(){
        return super.toString()+" " + nama;
    }
    
}
