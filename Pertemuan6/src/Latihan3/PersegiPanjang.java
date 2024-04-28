package Latihan3;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class PersegiPanjang {

    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public Double luas() {
        return panjang * lebar;
    }

    public Double kel() {
        return 2 * (panjang + lebar);
    }

    @Override
    public String toString() {
        return "Panjang = " + panjang + "\nLebar = " + lebar + "\nLuas = " + luas() + "\nKeliling = " + kel();
    }

}
