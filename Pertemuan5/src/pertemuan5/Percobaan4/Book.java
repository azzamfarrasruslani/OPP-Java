package Pertemuan5.Percobaan4;

/**
 *
 * @author Admin
 */
public class Book {

    private String title;
    private String author;

    public Book() {
        title = "";
        author = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void tampilInfo() {
        System.out.println("Judul buku : " + getTitle());
        System.out.println("Penulis buku : " + getAuthor());
    }

}
