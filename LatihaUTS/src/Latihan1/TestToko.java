package Latihan1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;

public class TestToko {

    public static void main(String[] args) {
        int jmlEtDepan = 0, jmlEtBlkg = 0;
        int jmlProduk = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah produk"));
        Toko produk[] = new Toko[jmlProduk];

//        Pembuatan array object
        for (int i = 0; i < produk.length; i++) {
            produk[i] = new Toko();

        }

//        Melakukan input produk
        for (int i = 0; i < produk.length; i++) {
            produk[i].setId(JOptionPane.showInputDialog("Masukan id produk ke- " + (i + 1)));
            produk[i].setNmProduk(JOptionPane.showInputDialog("Masukan nama produk dengan id " + produk[i].getId()));
            produk[i].setThRilis(Integer.parseInt(JOptionPane.showInputDialog("Masukan tahun rilis produk dengan id " + produk[i].getId())));
            produk[i].setHarga(Double.parseDouble(JOptionPane.showInputDialog("Masukan harga produk dengan id " + produk[i].getId())));
        }

//        Output program
        System.out.printf("%50s\n", "Daftar Katalog Toko");
        System.out.println("======================================================================================================");
        System.out.printf("|%-5s|%-15s|%-15s|%-15s|%-15s|%-30s|\n", "No", "Id", "Nama Peoduk", "Tahun Rilis", "Harga", "Keterangan");
        System.out.println("======================================================================================================");
        for (int i = 0; i < produk.length; i++) {
            System.out.printf("|%-5s|%-15s|%-15s|%-15s|%-15s|%-30s|\n", (i + 1), produk[i].getId(), produk[i].getNmProduk(), produk[i].getThRilis(), produk[i].getHarga(), produk[i].ket());
            jmlEtDepan += produk[i].jmlEtalaseDp();
            jmlEtBlkg += produk[i].jmlEtalaseBl();
        }
        System.out.println("======================================================================================================");
        System.out.println();
        System.out.println("Jumlah barang dietalase depan : " + jmlEtDepan);
        System.out.println("Jumlah barang detalase belakang : " + jmlEtBlkg);
    }
}
