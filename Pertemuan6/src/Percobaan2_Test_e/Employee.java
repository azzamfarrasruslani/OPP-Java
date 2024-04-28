/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2_Test_e;
import Percobaan2.*;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Employee {
    private int id,age;
    private String name;
    private double salary;
    
    
    public void getData() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukan Id Karyawan : ");
        id = Integer.parseInt(sc.nextLine());
        
        
        System.out.println("Masukan Nama Karyawan : ");
        name = sc.nextLine();
        
        System.out.println("Masukan Umur Kayawan : ");
        age = Integer.parseInt(sc.nextLine());
        
        System.out.println("Masukan Gaji Karyawan : ");
        salary = Double.parseDouble(sc.nextLine());
        
    }
    
    public void putData () {
        System.out.println(id + "\t" + name + "\t" + age + "\t " + salary);
    }
}
