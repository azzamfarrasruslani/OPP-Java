/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5.Percobaan3.Another;

/**
 *
 * @author Admin
 */
public class Mobil {

    protected String warna;
    protected String merek;

    protected Mobil() {
        this.warna = "";
        this.merek = "";
    }

    protected void setMerek(String merek) {
        this.merek = merek;
    }

    protected void beriWarna() {
        System.out.println("Warna mobil ini adalah " + warna);
    }

    protected void beriMerek() {
        System.out.println("Merek mobil ini adalah " + merek);
    }
}
