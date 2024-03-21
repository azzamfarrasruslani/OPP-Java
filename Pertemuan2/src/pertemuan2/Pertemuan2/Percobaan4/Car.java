/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2.Percobaan4;

/**
 *
 * @author Admin
 */
public class Car {

//    Create a fullThottle() method
    public void fullThorottle() {
        System.out.println("The car is going as fast as it can!");
    }
//    Create a speed() method and add a paramenter
    public void speed(int maxSpeed) {
        System.out.println("Max Speed is : " + maxSpeed);
    }
    
//    Tambahan
    public void model (String color ) {
        System.out.println("Color car : " +  color);
    }
    
    public static void main(String[] args) {
        Car myCar = new Car();
        
        myCar.fullThorottle();
        myCar.speed(200);
        myCar.model("red");
    }
}

