/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2_Test_e;

import Percobaan2.*;

/**
 *
 * @author Admin
 */
public class TestEmployee {

    public static void main(String[] args) {
        int n = 2;
        int i;

       
           Employee emp = new Employee();
        

        for (i = 0; i < n; i++) {
            System.out.println("Masukan Detail data Karyawan " + (i + 1) + " : ");
            emp.getData();
            System.out.println();
        }
        
        System.out.println("Detail Karyawan yang telah diinputkan : ");
        System.out.println("Id\tNama\tUmur\tGaji");
         for (i = 0; i < n; i++) {
            emp.putData();
        }
    }
}
