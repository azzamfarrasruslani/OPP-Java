package Latihan4;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;

public class TestTokoElektronik {

    public static void main(String[] args) {
        String id, NmProduk;
        int ThRilis,harga;
        

        int jmlProduk = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Produk"));
        TokoElektronik produk[] = new TokoElektronik[jmlProduk];

        for (int i = 0; i < produk.length; i++) {
            id = JOptionPane.showInputDialog("Masukan ID Produk ke- " + (i + 1));
            NmProduk = JOptionPane.showInputDialog("Masukan Nama Produk " + id);
            ThRilis = Integer.parseInt(JOptionPane.showInputDialog("Masukan Tahun Rilis Produk " + id));
            harga = Integer.parseInt(JOptionPane.showInputDialog("Masukan Harga Produk " + id));
            produk[i] = new TokoElektronik(id, NmProduk, ThRilis, harga);
        }

        System.out.printf("%55s\n", "Daftar Katalog Produk Toko Eletronik A");
        System.out.println("====================================================================================================");
        System.out.printf("|%-3s|%-10s|%-15s|%-15s|%-15s|%-35s|\n", "No", "Id", "Nama Produk", "Tahun Rilis", "Harga", "Keterangan");
        System.out.println("====================================================================================================");
        for (int i = 0; i < produk.length; i++) {
            System.out.printf("|%-3s|%-10s|%-15s|%-15s|%-15s|%-35s|\n", (i + 1), produk[i].id, produk[i].NmProduk, produk[i].ThRilis,
                    produk[i].harga, produk[i].ket());
        }
        System.out.println("====================================================================================================");
    }
}
