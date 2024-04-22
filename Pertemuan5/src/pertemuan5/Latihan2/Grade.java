package pertemuan5.Latihan2;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Grade {

    private String nama, nim;
    private double nilaiAkhir;

    public Grade() {
        nama = "";
        nim = "";
        nilaiAkhir = 0;
    }
//Getter

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }
//Setter

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public double calNilai(double latihan, double kuis, double uts, double uas) {
        nilaiAkhir = (latihan + kuis + uts + uas) / 4;
        return nilaiAkhir;
    }

    public double addPoin(double nilaiAkhir) {
        double add;
        if (nilaiAkhir == 50) {
            add = nilaiAkhir + 2;
        } else if (nilaiAkhir > 96) {
            add = nilaiAkhir - 2;
        } else {
            add = nilaiAkhir + 0;
        }
        return add;
    }

    public String grade(double nilaiAkhir) { 
        String nilaiHuruf;
        if (nilaiAkhir >= 81 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 76 && nilaiAkhir <= 80) {
            nilaiHuruf = "AB";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 61 && nilaiAkhir <= 65) {
            nilaiHuruf = "BC";
        } else if (nilaiAkhir >= 51 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 0 && nilaiAkhir <= 50) {
            nilaiHuruf = "F";
        } else {
            nilaiHuruf = "none";
        }
        return nilaiHuruf;
    }

    public String hadiah(double nilaiAkhir) {
        String dapat;
        if (nilaiAkhir >= 81 && nilaiAkhir <= 100) {
            dapat = "Uang 1M";
        } else {
            dapat = "None";
        }
        return dapat;
    }

}
