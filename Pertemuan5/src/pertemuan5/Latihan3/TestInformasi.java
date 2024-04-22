package pertemuan5.Latihan3;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;

public class TestInformasi {

    public static void main(String[] args) {
        Informasi cari = new Informasi();

        int pilih = Integer.parseInt(JOptionPane.showInputDialog("Ingin Mencari Berdasarkan \n1. Jurusan \n2. Akreditasi"));
        switch (pilih) {
            case 1:
                cari.setJurusan(JOptionPane.showInputDialog("Masukan Jurusan"));
                cari.infoJurusan();
                break;
            case 2:
                cari.setAkre(JOptionPane.showInputDialog("Masukan Akreditasi"));
                cari.infoJurusan();
                break;
        }

    }

}
