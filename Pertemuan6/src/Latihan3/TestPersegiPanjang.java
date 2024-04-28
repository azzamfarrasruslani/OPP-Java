package Latihan3;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;

public class TestPersegiPanjang {

    public static void main(String[] args) {
        int jmlBangun = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Bangun Persegi Panjang  Yang Ingin Dimasukan"));
        PersegiPanjang bangun[] = new PersegiPanjang[jmlBangun];

        for (int i = 0; i < bangun.length; i++) {
            double panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan Panjang Persegi Panjang bangun ke- " + (i + 1)));
            double lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukan Lebar Persegi Panjang bangun ke- " + (i + 1)));
            bangun[i] = new PersegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < bangun.length; i++) {
            System.out.println("Bangun " + (i + 1) + " Persegi Panjang");
            System.out.println(bangun[i].toString());
            System.out.println();

        }

    }
}
