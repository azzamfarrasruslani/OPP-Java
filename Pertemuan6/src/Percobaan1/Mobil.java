package Percobaan1;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class Mobil {

    private String wrn;
    private String merk;

    public void setWrn(String wrn) {
        this.wrn = wrn;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWrn() {
        return wrn;
    }

    public String getMerk() {
        return merk;
    }

    public Mobil(String wrn, String merk) {
       wrn = "";
       merk = "";
    }

    public void setData() {
        wrn = JOptionPane.showInputDialog("Inputkan Warna kendaraan : ");
        merk = JOptionPane.showInputDialog("Inputkan Merek kendaraan : ");
    }

    public void info() {
        System.out.println("Warna : " + wrn + "\nMerek : " + merk);
    }
}
