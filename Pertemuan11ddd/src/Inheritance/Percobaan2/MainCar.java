package Inheritance.Percobaan2;

/**
 *
 * @author Admin
 */
public class MainCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Origin: " + myCar.origin);
        myCar.honk();
    }
   
}
