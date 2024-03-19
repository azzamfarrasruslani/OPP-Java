
package Pertemuan_1.Percobaan_1;

/**
 *
 * @author lab25601
 */
public class CobaAja {

    public static void cetak (){
        System.out.println("Cetak");
    }

    public void myMedthod() {
        System.out.println("Ini adalah myMedthod");
    }
    
    public void saya() {
        System.out.println("Saya Belajar PBO saat sedang puasa");
    }

    public static void main(String[] args) {
        CobaAja A = new CobaAja();

        CobaAja B = new CobaAja();
        CobaAja C = new CobaAja();

        A.cetak();
        CobaAja.cetak();
        B.myMedthod();
        C.saya();
    }
}
