package Latihan7;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Main {

    public static void main(String[] args) {
  
        GenreBuku fantasi = new GenreBuku("Fantasi", "Buku fiksi dengan konten imajinatif.");
        GenreBuku aksi = new GenreBuku("Aksi", "Buku berdasarkan fakta dan informasi nyata.");

       
        Buku buku1 = new Buku("Harry Potter", fantasi);
        Buku buku2 = new Buku("Matahari Minor", aksi);


        System.out.println("Detail Buku 1:");
        buku1.tampilkanDetailBuku();
        System.out.println();

        System.out.println("Detail Buku 2:");
        buku2.tampilkanDetailBuku();
        System.out.println();

        
        buku1.ubahGenre(aksi);
        System.out.println();

        System.out.println("Detail Buku 1 Setelah Genre Diubah:");
        buku1.tampilkanDetailBuku();
    }
}
