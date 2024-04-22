package pertemuan5.Latihan6;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TestTiket {
    public static void main(String[] args) {
        Tiket tk1 = new Tiket("Garuda Indonesia", null, null, null);
        Tiket tk2 = new Tiket("CitiLink", "A5", "05:30", "1-April-2020");
        
        System.out.println("Tiket 1");
        System.out.println("Maskapai : " + tk1.getMaskapai());
        System.out.println("No Kursi : "  + tk1.getNoKursi());
        System.out.println("Keberangkatan : " + tk1.getBerangkat());
        System.out.println("Tanggal Penerbangan : " + tk1.getTglTerbang());
        
        System.out.println();
        System.out.println("Tiket 2");
        System.out.println("Maskapai : " + tk2.getMaskapai());
        System.out.println("No Kursi : "  + tk2.getNoKursi());
        System.out.println("Keberangkatan : " + tk2.getBerangkat());
        System.out.println("Tanggal Penerbangan : " + tk2.getTglTerbang());
        
        System.out.println();
        System.out.println("Update Data : ");
        tk1.setNoKursi("C12");
        tk1.setBerangkat("11:00");
        tk1.setTglTerbang("1-April-2020");
        System.out.println("Tiket 1");
        System.out.println("Maskapai : " + tk1.getMaskapai());
        System.out.println("No Kursi : "  + tk1.getNoKursi());
        System.out.println("Keberangkatan : " + tk1.getBerangkat());
        System.out.println("Tanggal Penerbangan : " + tk1.getTglTerbang());
        
        System.out.println();
        tk2.setBerangkat("13:00");
        System.out.println("Tiket 2");
        System.out.println("Maskapai : " + tk2.getMaskapai());
        System.out.println("No Kursi : "  + tk2.getNoKursi());
        System.out.println("Keberangkatan : " + tk2.getBerangkat());
        System.out.println("Tanggal Penerbangan : " + tk2.getTglTerbang());
    }
}
