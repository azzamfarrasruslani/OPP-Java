/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4.Lat4.bg1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Motor {
   private int kecepatan;

    public Motor() {
        this.kecepatan = 0;
    }

    public void naikGigi(int gigi) {
        if (gigi >= 1 && gigi <= 4) {
            this.kecepatan += 5 * gigi;
        }
    }

    public void turunGigi() {
        if (this.kecepatan >= 5) {
            this.kecepatan -= 5;
        }
    }

    public void rem() {
        if (this.kecepatan >= 5) {
            this.kecepatan -= 5;
        }
    }

    public int getKecepatan() {
        return this.kecepatan;
    }

    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.naikGigi(1);
        System.out.println("Kecepatan: " + motor.getKecepatan() + " km/jam");
        motor.turunGigi();
        System.out.println("Kecepatan: " + motor.getKecepatan() + " km/jam");
        motor.rem();
        System.out.println("Kecepatan: " + motor.getKecepatan() + " km/jam");
    }
 
}
