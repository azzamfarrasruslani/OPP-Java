package Latihan7;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Buku {

    private String judul;
    private GenreBuku genre;

    public Buku(String judul, GenreBuku genre) {
        this.judul = judul;
        this.genre = genre;
    }

    public void tampilkanDetailBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre.getNama());
        System.out.println("Deskripsi: " + genre.getDeskripsi());
    }

    public void ubahGenre(GenreBuku genreBaru) {
        this.genre = genreBaru;
        System.out.println("Genre diubah menjadi " + genreBaru.getNama());
    }
}
