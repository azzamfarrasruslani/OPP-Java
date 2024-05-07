package Latihan1_Final;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Grade {

    private String nama, nim, nilaiHuruf;
    private double nilaiUjian;

    public Grade() {
        nama = "";
        nim = "";
        nilaiHuruf = "";
        nilaiUjian = 0;
    }

//    Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNilaiUjian(double nilaiUjian) {
        this.nilaiUjian = nilaiUjian;
    }
//    Getter

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getNilaiUjian() {
        return nilaiUjian;
    }

//    Mengkalkulasi nilai ujian berdasarkan ketentuan
    public double calPoin() {
        if (nilaiUjian == 50) {
            return nilaiUjian + 2;
        } else if (nilaiUjian > 96) {
            return nilaiUjian - 2;
        } else {
            return nilaiUjian + 0;
        }

    }
//Menentukan nilai huruf dari nilai ujian yang telah di kalkulasikan sebelumnya

    public String grade() {
        if (calPoin() >= 81 && calPoin() <= 100) {
            return nilaiHuruf = "A";
        } else if (calPoin() >= 76 && calPoin() <= 80) {
            return nilaiHuruf = "AB";
        } else if (calPoin() >= 66 && calPoin() <= 75) {
            return nilaiHuruf = "B";
        } else if (calPoin() >= 61 && calPoin() <= 65) {
            return nilaiHuruf = "BC";
        } else if (calPoin() >= 51 && calPoin() <= 60) {
            return nilaiHuruf = "C";
        } else if (calPoin() >= 0 && calPoin() <= 50) {
            return nilaiHuruf = "F";
        } else {
            return nilaiHuruf = "none";
        }
    }

//    Menentukan hadiah apa yang didapat jika nilai huruf A
//    public String hadiah(double nilaiUjian) {
//        String dapat;
//        if (nilaiUjian >= 81 && nilaiUjian <= 100) {
//            dapat = "Uang 1M";
//        } else {
//            dapat = "None";
//        }
//        return dapat;
//    }
    public String hadiah() {
        String hadiah;
        if (nilaiHuruf.equalsIgnoreCase("A")) {
            hadiah = "Uang 1M";
        } else {
            hadiah = "None";
        }
        return hadiah;
    }

}
