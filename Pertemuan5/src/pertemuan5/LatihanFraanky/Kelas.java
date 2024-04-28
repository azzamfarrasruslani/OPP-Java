/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5.LatihanFraanky;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import javax.swing.JOptionPane;
public class Kelas {
    private String nama, nim, hadiah;
    private int nilai;

    public Kelas() {
        this.nama = null;
        this.nim = null;
        this.nilai = 0;
        this.hadiah = null;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public String getHadiah() {
        return hadiah;
    }

    public void setHadiah(String hadiah) {
        this.hadiah = hadiah;
    }

    public String huruf() {
        if (nilai >= 81) {
            return "A";
        } else if ((80 >= nilai) && (nilai >= 76)) {
            return "AB";
        } else if ((75 >= nilai) && (nilai >= 66)) {
            return "B";
        } else if ((65 >= nilai) && (nilai >= 61)) {
            return "BC";
        } else if ((60 >= nilai) && (nilai >= 51)) {
            return "C";
        } else {
            return "F";
        }
    }

    public int penambahan() {
        if (nilai == 50) {
            return nilai = nilai + 2;
        } else if (nilai > 96) {
            return nilai = nilai - 2;
        } else {
            return nilai = nilai + 0;
        }
    }

    public String tampilkan() {
        return "hadiah yang didapat oleh " + nama + " adalah " + hadiah;
    }

    public static void main(String[] args) {
        Kelas obj = new Kelas();
        JOptionPane input = new JOptionPane();

        int siswa = Integer.parseInt(JOptionPane.showInputDialog(null, "Tentukan banyak siswa"));

        for (int i = 1; i <= siswa; i++) {
            String nama = JOptionPane.showInputDialog("Masukkan nama siswa");
            obj.setNama(nama);
            String nim = JOptionPane.showInputDialog("Masukkan NIM siswa");
            obj.setNim(nim);
            int nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai siswa"));
            obj.setNilai(nilai);

            if (obj.huruf() == "A") {
                String hadiah = JOptionPane.showInputDialog("Masukkan hadiah untuk " + nama);
                obj.setHadiah(hadiah);
            } else {
                obj.setHadiah(null);
            }

            if (obj.getHadiah() != null) {
                System.out.println(obj.tampilkan());
            }
        }
    }
}
