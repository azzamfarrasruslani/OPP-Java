package Pertemuan_1.Percobaan_3;

/**
 *
 * @author lab25601
 */
public class PersegiPanjang {
    double panjang;
    double lebar;
    
    
    double luas() {
        double ls;
        ls = panjang * lebar;
        return ls; //jika dihilangkan akan eror
    }
    
    void keliling() {
       double kll;
       kll = (2*panjang) + (2*lebar);
        System.out.println("Keliling Persegi Panjang : " + kll);
    }

    

}
