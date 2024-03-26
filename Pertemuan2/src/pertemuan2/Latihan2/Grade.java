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
    
    
     public String grade  (int nilai) { // Menggunakan parameter int nilai
        String nilaiHuruf;
        if (nilai >= 81 && nilai <= 100) {
            nilaiHuruf = "A";
        } else if (nilai >= 76 && nilai <= 80) {
            nilaiHuruf = "AB";
        } else if (nilai >= 66 && nilai <= 75) {
            nilaiHuruf = "B";
        } else if (nilai >= 61 && nilai <= 65) {
            nilaiHuruf = "BC";
        } else if(nilai >= 51 && nilai <= 60){
            nilaiHuruf = "C";
        } else {
            nilaiHuruf = "F";
        }
        return nilaiHuruf;
    }
    public void ket() {

    }
}
