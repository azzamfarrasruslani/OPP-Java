/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2.Percobaan6;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class VolumeBangunRuang {
    public void volumeKubus (double sisi) {
        double volume = sisi * sisi * sisi;
        JOptionPane.showMessageDialog(null, "Volume kubus : " + volume);
    }
    public double volumeBalok (double panjang, double lebar, double tinggi) {
        double volume = panjang*lebar*tinggi;
        return volume;
    } 
}
