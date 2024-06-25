package Polimorfisme.Percobaan2;

/**
 *
 * @author Admin
 */
public class Demo {

    public void displayPattern() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
    }
    
    public void displayPattern(char symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.println(symbol);
        }
    }
}
