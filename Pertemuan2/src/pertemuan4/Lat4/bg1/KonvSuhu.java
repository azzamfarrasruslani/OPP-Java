/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4.Lat4.bg1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class KonvSuhu {
    double suhu;

  
    public KonvSuhu(double suhu) {
        this.suhu = suhu;
    }

   
    public double celciusToReamur() {
        return suhu * 4 / 5;
    }

   
    public double celciusToFahrenheit() {
        return (suhu * 9 / 5) + 32;
    }


    public double reamurToCelcius() {
        return suhu * 5 / 4;
    }

   
    public double reamurToFahrenheit() {
        return (suhu * 9 / 4) + 32;
    }

   
    public double fahrenheitToCelcius() {
        return (suhu - 32) * 5 / 9;
    }

  
    public double fahrenheitToReamur() {
        return (suhu - 32) * 4 / 9;
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas KonvSuhu
        KonvSuhu konversi = new KonvSuhu(30); // Suhu awal dalam Celcius

        // Konversi suhu dari Celcius ke Reamur
        System.out.println("Konversi Celcius ke Reamur: " + konversi.celciusToReamur());

        // Konversi suhu dari Celcius ke Fahrenheit
        System.out.println("Konversi Celcius ke Fahrenheit: " + konversi.celciusToFahrenheit());

        // Konversi suhu dari Reamur ke Celcius
        System.out.println("Konversi Reamur ke Celcius: " + konversi.reamurToCelcius());

        // Konversi suhu dari Reamur ke Fahrenheit
        System.out.println("Konversi Reamur ke Fahrenheit: " + konversi.reamurToFahrenheit());

        // Konversi suhu dari Fahrenheit ke Celcius
        System.out.println("Konversi Fahrenheit ke Celcius: " + konversi.fahrenheitToCelcius());

        // Konversi suhu dari Fahrenheit ke Reamur
        System.out.println("Konversi Fahrenheit ke Reamur: " + konversi.fahrenheitToReamur());
    }
}
