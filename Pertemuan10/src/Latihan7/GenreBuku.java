package Latihan7;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class GenreBuku {

    private String nama;
    private String deskripsi;

    public GenreBuku(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void ubahDeskripsi(String deskripsiBaru) {
        this.deskripsi = deskripsiBaru;
        System.out.println("Deskripsi diubah menjadi " + deskripsiBaru);
    }
}
