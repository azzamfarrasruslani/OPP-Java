package Latihan1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Grade {

    private String nama, nim;
    private double nilaiUjian;

    public Grade() {
        nama = "";
        nim = "";
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
    public double calPoin(double nilaiUjian) {
        double poin;
        if (nilaiUjian == 50) {
            poin = nilaiUjian + 2;
        } else if (nilaiUjian > 96) {
            poin = nilaiUjian - 2;
        } else {
            poin = nilaiUjian + 0;
        }
        return poin;
    }
//Menentukan nilai huruf dari nilai ujian yang telah di kalkulasikan sebelumnya

    public String grade(double nilaiUjian) {
        String nilaiHuruf;
        if (nilaiUjian >= 81 && nilaiUjian <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiUjian >= 76 && nilaiUjian <= 80) {
            nilaiHuruf = "AB";
        } else if (nilaiUjian >= 66 && nilaiUjian <= 75) {
            nilaiHuruf = "B";
        } else if (nilaiUjian >= 61 && nilaiUjian <= 65) {
            nilaiHuruf = "BC";
        } else if (nilaiUjian >= 51 && nilaiUjian <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiUjian >= 0 && nilaiUjian <= 50) {
            nilaiHuruf = "F";
        } else {
            nilaiHuruf = "none";
        }
        return nilaiHuruf;
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
    
    public String hadiah(String nilaiHuruf) {
        String dapat;
        if (nilaiHuruf.equalsIgnoreCase("A")) {
            dapat = "Uang 1M";
        } else {
            dapat = "None";
        }
        return dapat;
    }

}
