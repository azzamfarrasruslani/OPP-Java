package Latihan1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Toko {

    private String id, nmProduk;
    private int thRilis;
    private double harga;

    public Toko() {
        id = "";
        nmProduk = "";
        thRilis = 0;
        harga = 0;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNmProduk(String nmProduk) {
        this.nmProduk = nmProduk;
    }

    public void setThRilis(int thRilis) {
        this.thRilis = thRilis;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public String getNmProduk() {
        return nmProduk;
    }

    public int getThRilis() {
        return thRilis;
    }

    public double getHarga() {
        return harga;
    }
    
    public String ket () {
        if (thRilis >= 2021) {
            return "ditampilkan dietalase depan";
        } else {
            return "ditampilkan dietalase belakang";
        }
    }
    
    public int jmlEtalaseDp () {
        if (ket().equalsIgnoreCase("ditampilkan dietalase depan")) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public int jmlEtalaseBl () {
        if (ket().equalsIgnoreCase("ditampilkan dietalase belakang")) {
            return 1;
        } else {
            return 0;
        }
    }

}
