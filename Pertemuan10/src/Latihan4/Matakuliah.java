package Latihan4;

public class Matakuliah {

    String namaMatkul;

    public Matakuliah(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }
    
    public void tampilInfoMatkul () {
             System.out.println("Nama Mata Kuliah: " + namaMatkul);
    }
}