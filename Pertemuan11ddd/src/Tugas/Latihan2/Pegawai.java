package Tugas.Latihan2;

/**
 *
 * @author Admin
 */
public class Pegawai {

    int gajiPokok;
    String posisi;

    public Pegawai() {
        System.out.println("Ini adalah class Pegawai");
    }

    public Pegawai(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void aturanDatang() {
        System.out.println(posisi + " datang tepat waktu");
    }

    public void aturanAbsen() {
        System.out.println(posisi + " sudah mengisi absensi");
    }

    public void aturanMeeting() {
        System.out.println(posisi + " melakukan meeting mingguan");
    }

    public void gajiPokok() {
        System.out.println("Gaji Pokok " + posisi + " adalah " + gajiPokok);
    }

}
