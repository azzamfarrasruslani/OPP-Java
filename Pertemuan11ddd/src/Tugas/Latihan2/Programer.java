package Tugas.Latihan2;

/**
 *
 * @author Admin
 */
public class Programer extends Pegawai {

    int bonusGaji;

    public Programer() {
        super();
        System.out.println("Ini adalah class programer");
    }

    public void monitoringSystem() {
        System.out.println("Programer melakukan monitoring sistem perusahaan");
    }

    public void errorComplain() {
        System.out.println("Programer melayani error complain");
    }

    public void bonusGaji() {
        System.out.println("Bonus gaji adalah + " + bonusGaji);
    }

    public int totGaji() {
        return gajiPokok + bonusGaji;
    }

}
