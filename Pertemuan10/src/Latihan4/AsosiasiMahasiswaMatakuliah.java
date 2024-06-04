package Latihan4;



public class AsosiasiMahasiswaMatakuliah {

    public static void main(String[] args) {

        String nim, nama, namaMatkul, kodeMatkul;

        Mahasiswa mhs = new Mahasiswa("2355301028", "Azzam");
        Matakuliah matkul1 = new Matakuliah("Algoritma Pemograman");
        Matakuliah matkul2 = new Matakuliah("Basis data lanjut");

        mhs.setMatkulDiambil(matkul1.namaMatkul);
        mhs.setMatkulDiambil(matkul2.namaMatkul);
       
        mhs.tampilInfoMahasiswa();
        System.out.println();
        
        matkul1.tampilInfoMatkul();
        System.out.println("Keterangan : ");
        System.out.println("Mempelajari pemograman java");
        System.out.println();
        
        matkul2.tampilInfoMatkul();
        System.out.println("Keterangan : ");
        System.out.println("Mata kuliah lanjutan dari basis data dasar");
    }
}
