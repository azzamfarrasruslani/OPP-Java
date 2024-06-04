package Latihan4;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Mahasiswa {

    private String nim, nama;
    private int jmlMatkulMhs = 0;
    String matkulDiambil[] = new String[10];

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJmlMatkulMhs() {
        return jmlMatkulMhs;
    }

    public void setJmlMatkulMhs(int jmlMatkulMhs) {
        this.jmlMatkulMhs = jmlMatkulMhs;
    }

    public String getMatkulDiambil(int i) {
        return (matkulDiambil[i]);
    }

    public void setMatkulDiambil(String matkulDiambil) {
        if (jmlMatkulMhs < 10) {
            this.matkulDiambil[jmlMatkulMhs] = matkulDiambil;
            jmlMatkulMhs++;
        }
    }

    public void tampilInfoMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah Mata Kuliah yang Diambil: " + jmlMatkulMhs);
        for (int i = 0; i < jmlMatkulMhs; i++) {
            System.out.println((i + 1) + ". " + matkulDiambil[i]);
        }
    }
}
