package Latihan6;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Main {

    public static void main(String[] args) {
        Matakuliah[] matkul = new Matakuliah[3];

        matkul[0] = new Matakuliah("BDL", "Basis Data Lanjut", 3);
        matkul[1] = new Matakuliah("PBO", "Pemrograman Berorientasi Objek", 2);
        matkul[2] = new Matakuliah("WRPL", "Workshop Rekayasa Perangkat Lunak", 3);

        Nilai[] nilai = new Nilai[3];

        nilai[0] = new Nilai(matkul[0], 80);
        nilai[1] = new Nilai(matkul[1], 90);
        nilai[2] = new Nilai(matkul[2], 100);

        System.out.println("Data Nilai Matakuliah");
        System.out.println("================================================================");
        System.out.printf("|%-5s|%-15s|%-35s|%-15s|%-15s|\n", "No", "Kode Matkul", "Nama Matkul", "Jumlah SKS", "Nilai");
        System.out.println("================================================================");
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("|%-5d|%-15s|%-35s|%-15d|%-15.2f|\n", (i + 1), matkul[i].getKodeMatkul(), matkul[i].getNamaMatkul(), matkul[i].getSks(), nilai[i].getNilai());
        }
        System.out.println("================================================================");
    }
}
