package Pertemuan4.Lat1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class MyClass {
    String nama, jurusan;
    int umur;
    
    public MyClass (String nama, String jurusan, int umur) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.umur = umur;
    }
//    public MyClass () {
//        this.nama = nama;
//        this.jurusan = jurusan;
//        this.umur = umur;
//    }
    
    public void info () {
        System.out.println("Nama :" + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Umur : " + umur);
    }
}
