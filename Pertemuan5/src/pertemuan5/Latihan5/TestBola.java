package pertemuan5.Latihan5;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TestBola {

    public static void main(String[] args) {
  
        Bola infoBola = new Bola(4, "Bola Pimpong");
        System.out.println("Keadaan Awal");
        System.out.println("Jari - Jari : " + infoBola.getJari());
        System.out.println("Jenis Bola : " + infoBola.getJenis());
        System.out.println("Volume Bola : " + String.format("%.2f", infoBola.volumBola()));

        System.out.println();
        infoBola.setJari(10);
        infoBola.setJenis("Basket");
        System.out.println("Jari - Jari : " + infoBola.getJari());
        System.out.println("Jenis Bola : " + infoBola.getJenis());
        System.out.println("Volume Bola : " + String.format("%.2f", infoBola.volumBola()));
        
        System.out.println();
        System.out.println("Keadaan Setelah Perubahan");
        infoBola.setJari(20);
        infoBola.setJenis("Bola Pimpong");
        System.out.println("Jari - Jari : " + infoBola.getJari());
        System.out.println("Jenis Bola : " + infoBola.getJenis());
        System.out.println("Volume Bola : " + String.format("%.2f", infoBola.volumBola()));
        
        System.out.println();
        infoBola.setJari(2);
        infoBola.setJenis("Kelereng");
        System.out.println("Jari - Jari : " + infoBola.getJari());
        System.out.println("Jenis Bola : " + infoBola.getJenis());
        System.out.println("Volume Bola : " + String.format("%.2f", infoBola.volumBola()));

    }
}
