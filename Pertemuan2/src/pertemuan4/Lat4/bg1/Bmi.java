package pertemuan4.Lat4.bg1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Bmi {

    double berat;
    double tinggi; 

    public Bmi(double berat, double tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;
    }

 
    public double hitBMI() {
      
        return berat / (tinggi * tinggi);
    }


    public String kategori() {
        double bmi = hitBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Bmi orang = new Bmi(60, 1.5);
        double bmi = orang.hitBMI();
        String category = orang.kategori();
        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + category);
    }
}
