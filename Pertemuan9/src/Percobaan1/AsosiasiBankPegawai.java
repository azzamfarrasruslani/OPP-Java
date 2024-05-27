package Percobaan1;

/**
 *
 * @author Admin
 */
public class AsosiasiBankPegawai {

    public static void main(String[] args) {
        Bank1 bank = new Bank1("Mandiri");

        Pegawai pg1 = new Pegawai("Budi");

//        Bank uses pegawai
        bank.setNamaPegawai(pg1.getName());

        System.out.println("Nama Bank : " + bank.getName());
        System.out.println("Nama Pegawai : " + bank.getNamaPegawai());

//        Pegawai uses bank
        System.out.println();
        pg1.setBankName(bank.getName());
        System.out.println("Pegawain dengan nama " + pg1.getName() 
        + " bekerja pada bank " + pg1.getBankName());
        
    }
}
