package Pertemuan_1.Percobaaan_4_1;

public class Motorsycles {
    String make;
    String color;
    boolean engineState;
    
    
    void startEngine() {
        if (engineState == true) {
            System.out.println("The engine is already on.");
        } else {
            engineState = true;
            System.out.println("The engine is now on.");
        }
    }
    
    
    void showAtts() {
        System.out.println("This motorcycle is a " + color + " " + make);
        if (engineState == true) {
            System.out.println("This engine is on.");
        } else {
            System.out.println("The engine is off.");
        }
    }
}
