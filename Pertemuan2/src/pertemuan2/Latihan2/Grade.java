package pertemuan2.Latihan2;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Grade {
    
    public int getNilai (int latihan, int kuis, int uts, int uas) {
        
        int nilai = (latihan + kuis + uts + uas)/4;
        return nilai;
    }
    
    
//    public String nilai (String nilaiHuruf) {
//        int nilai = 0;
//        if (nilai >= 81 && nilai <= 100) {
//            nilaiHuruf = "A";
//        } else if (nilai >= 76 && nilai <= 80) {
//            nilaiHuruf = "B";
//        } else if (nilai >= 66 && nilai <= 75) {
//            nilaiHuruf = "C";
//        } else if (nilai >= 51 && nilai <= 65) {
//            nilaiHuruf = "D";
//        } else {
//            nilaiHuruf = "F";
//        }
//        return nilaiHuruf;
//    }
     public String grade  (int nilai) { // Menggunakan parameter int nilai
        String nilaiHuruf;
        if (nilai >= 81 && nilai <= 100) {
            nilaiHuruf = "A";
        } else if (nilai >= 76 && nilai <= 80) {
            nilaiHuruf = "B";
        } else if (nilai >= 66 && nilai <= 75) {
            nilaiHuruf = "C";
        } else if (nilai >= 51 && nilai <= 65) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "F";
        }
        return nilaiHuruf;
    }
    public void ket() {

    }
}
