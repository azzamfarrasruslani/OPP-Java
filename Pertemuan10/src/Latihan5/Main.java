package Latihan5;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nim, namaMhs, idDosen, namaDosen;

        Kampus kampus = new Kampus("Politeknik Caltek Riau", 1, 1);

        for (int i = 0; i < kampus.mhs.length; i++) {
            nim = JOptionPane.showInputDialog("Masukan nim mahasiswa ke- " + (i + 1));
            namaMhs = JOptionPane.showInputDialog("Masukan nama mahasiswa ke- " + (i + 1));
            kampus.mhs[i] = new Mahasiswa(nim, namaMhs);
        }

        for (int i = 0; i < kampus.dosen.length; i++) {
            namaDosen = JOptionPane.showInputDialog("Masukan id dosen ke- " + (i + 1));
            idDosen = JOptionPane.showInputDialog("Masukan nama dosen ke- " + (i + 1));
            kampus.dosen[i] = new Dosen(namaDosen, idDosen);
        }

        System.out.println();

        System.out.println("Data Mahasiswa");
        System.out.println("Nim" + "\tNama");
        for (int i = 0; i < kampus.mhs.length; i++) {
            System.out.println(kampus.mhs[i].namaMhs + "\t" + kampus.mhs[i].nim);
            System.out.println();
        }
        
        System.out.println("Data Dosen");
        System.out.println("ID Dosen" + "\tNama");
        for (int i = 0; i < kampus.dosen.length; i++) {
            System.out.println(kampus.dosen[i].idDosen + "\t" + kampus.dosen[i].namaDosen);
        }
        
        

    }
}
