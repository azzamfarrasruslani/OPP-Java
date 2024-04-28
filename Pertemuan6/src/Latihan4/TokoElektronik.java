package Latihan4;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TokoElektronik {

    String id, NmProduk;
    int ThRilis,harga;

    public TokoElektronik(String id, String NmProduk, int ThRilis, int harga) {
        this.id = id;
        this.NmProduk = NmProduk;
        this.ThRilis = ThRilis;
        this.harga = harga;
    }
    
    
    public String ket () {
        if (ThRilis >= 2021) {
            return "Ditempatkan di etalase depan";
        } else if ( ThRilis < 2021) {
            return "Ditempatkan di etalase belakang";
        } else {
            return "Data Tidak Ditemukan";
        }
        
    }

}
