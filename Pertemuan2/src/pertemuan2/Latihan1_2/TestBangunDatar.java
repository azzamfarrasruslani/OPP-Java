package pertemuan2.Latihan1_2;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TestBangunDatar {

    public static void main(String[] args) {
        BangunDatar obj = new BangunDatar();
        int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Pilihan\n1.Menghitung Luas Bangun Datar\n2.Menghitung Keliling Bangun Datar"));
        switch (pilihan) {

            case 1:
                obj.luasBangunDt(pilihan);
                break;
            case 2:

                break;
        }
    }
}
