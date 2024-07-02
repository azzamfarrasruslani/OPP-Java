package Interface.Percobaan4;

/**
 *
 * @author Admin
 */
public class Demo {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(6);
        System.out.println("Keliling persegi : " + persegi.hitungKeliling());
        System.out.println("Luas persegi : " + persegi.hitungLuas());
    }
}
