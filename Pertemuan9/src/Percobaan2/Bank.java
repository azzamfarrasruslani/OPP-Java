package Percobaan2;

/**
 *
 * @author Admin
 */
public class Bank {

    private String name;
    private int jmlPegawai = 0;
    private String namaPegawai[] = new String[10];

    public Bank(String name) {
        this.name = name;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJmlPegawai() {
        return jmlPegawai;
    }

    public String getNamaPegawai(int i) {
        return (namaPegawai[i]);
    }
    
//    public String []getNamaPegawai() {
//        return namaPegawai;
//    } 
//    ERROR 2

//    public void setNamaPegawai(String[] namaPegawai) {
//        if (jmlPegawai <10) {
//            this.namaPegawai[jmlPegawai]=namaPegawai;
//            jmlPegawai++;
//        }
//    } ERROR 1
    
    
    public void setNamaPegawai(String namaPegawai) {
        if (jmlPegawai <10) {
            this.namaPegawai[jmlPegawai]=namaPegawai;
            jmlPegawai++;
        }
    }


}
