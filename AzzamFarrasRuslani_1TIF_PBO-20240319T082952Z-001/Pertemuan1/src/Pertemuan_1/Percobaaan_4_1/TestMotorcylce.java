package Pertemuan_1.Percobaaan_4_1;



public class TestMotorcylce {
    public static void main(String[] args) {
        Motorsycles m = new Motorsycles();
        m.make = "Yamaha RZ350";
        m.color = "yellow";
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("------");
        System.out.println("Starting engine...");
        m.startEngine();
        System.out.println("------");
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("------");
        System.out.println("Starting engine...");
        m.startEngine();
    }
}
