package Inheritance.Percobaan3;

/**
 *
 * @author Admin
 */
public class Dog extends Animal {

    public Dog() {
        super();
        System.out.println("I am a dog");
    }
    
    @Override
    public void eat() {
        super.eat();
        System.out.println("I eat dog food");
    }
    
    public void bark() {
        System.out.println("I can bark");
    }
}
