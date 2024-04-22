package Latihan4;

import javax.swing.JOptionPane;

public class Motor {

    private int kec, gigi;

    public Motor() {
        this.kec = 0;
        this.gigi = 0;
    }

    public void setKec(int kec) {
        this.kec = kec;
    }

    public void setGigi(int gigi) {
        this.gigi = gigi;
    }

    public int getKec() {
        return kec;
    }

    public int getGigi() {
        return gigi;
    }

    public void gigiNaik() {
        if (gigi >= 1 && gigi <= 4) {
            kec += 5 * gigi;
        }
    }

    public void gigiTurun() {
        kec -= 5;
    }

    public void rem() {
        kec -= 5;
    }

    public void info() {
        System.out.println("Kecepatan : " + kec + " km/jam" + "\nGigi saat ini : " + gigi);
    }

    public static void main(String[] args) {
        String aksi;
        Motor motor = new Motor();
        do {
            motor.info();
            int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilih Tindakan \n1. Tambah gigi \n2. Kurang gigi \n3. Rem"));
            switch (pilihan) {
                case 1:
                    int gigiTambah = Integer.parseInt(JOptionPane.showInputDialog("Masukan gigi"));
                    motor.setGigi(gigiTambah);
                    motor.gigiNaik();
                    motor.info();
                    break;
                case 2:
                    motor.gigiTurun();
                    motor.setGigi(motor.getGigi() - 1);
                    motor.info();
                    break;
                case 3:
                    motor.rem();
                    motor.setGigi(motor.getGigi() - 1);
                    motor.info();
                    break;
                default:
                    break;
            }
            aksi = JOptionPane.showInputDialog("Apakah Ingin melakukan aksi lagi ? ");
        } while (aksi.equalsIgnoreCase("ya"));
    }
}
