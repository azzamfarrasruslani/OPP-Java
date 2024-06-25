package Tugas.Latihan2;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Programer prg1 = new Programer();

        prg1.posisi = "programer";
        prg1.gajiPokok = 5000000;
        prg1.bonusGaji = 2000000;

        prg1.aturanDatang();
        prg1.aturanAbsen();
        prg1.aturanMeeting();
        prg1.gajiPokok();
        prg1.monitoringSystem();
        prg1.errorComplain();
        prg1.bonusGaji();
        System.out.println("Total Gaji : " + prg1.totGaji());

    }

}
