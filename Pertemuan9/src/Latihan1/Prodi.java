package Latihan1;

/**
 *
 * @author Admin
 */
public class Prodi {

    private String kodeProdi;
    private String namaProdi;
    private String[] nimMhs = new String[10];
    private String[] namaMhs = new String[10];
    private int jumlahMhs;
    private int dataMhs = 10;

    public String getNamaProdi() {
        return namaProdi;
    }

    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }

    public String getKodeProdi() {
        return kodeProdi;
    }

    public void setKodeProdi(String kodeProdi) {
        this.kodeProdi = kodeProdi;
    }

    public String getDataMhs(int indeks) {
        return nimMhs[indeks] + "\t" + namaMhs[indeks];
    }

    public void setDataMhs(String nimMhs, String namaMhs ) {
        if (jumlahMhs < this.dataMhs) {
            this.nimMhs[jumlahMhs] = nimMhs;
            this.namaMhs[jumlahMhs] = namaMhs;
            jumlahMhs++;
        }
    }

    public int getJumlahMhs() {
        return jumlahMhs;
    }

    public void setJumlahMhs(int jumlahMhs) {
        this.jumlahMhs = jumlahMhs;
    }
}
