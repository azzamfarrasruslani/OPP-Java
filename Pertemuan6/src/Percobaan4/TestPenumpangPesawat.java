package Percobaan4;

import java.util.Scanner;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TestPenumpangPesawat {

    public static void main(String[] args) {
        int n, i;
        String nama, jk, tujuan, kelas;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan jumlah penumpang yang akan diinputkan : ");
        n = Integer.parseInt(input.nextLine());
        //        deklarasi
        PenumpangPesawat penumpang[] = new PenumpangPesawat[n];

//       Inisiasi
        for (i = 0; i < n; i++) {
            penumpang[i] = new PenumpangPesawat();
        }

//        Input data 
        for (i = 0; i < n; i++) {
            System.out.println("Masukan data penumpang " + (i + 1));
            System.out.println("Masukan Nama Penumpang : ");
            nama = input.nextLine();
            System.out.println("Masukan jenis kelamin penumpang(L/P) : ");
            jk = input.nextLine();
            System.out.println("Masukan Tujuan penumpang : ");
            tujuan = input.nextLine();
            System.out.println("Masukan Kelas Penumpang");
            kelas = input.nextLine();
            
            System.out.println();
            
            penumpang[i].setNama(nama);
            penumpang[i].setJk(jk);
            penumpang[i].setTujuan(tujuan);
            penumpang[i].setKelas(kelas);

        }
                    
//            Show data
System.out.println("Detail penumpang yang telah diinputkan : ");
        System.out.println("Nama\tJK\tTujuan\tKelas");
        for (i = 0; i< n; i++) {
            System.out.println(penumpang[i].getNama() + "\t" + penumpang[i].getJk()
            + "\t" + penumpang[i].getTujuan() + ""
                    + "t" + penumpang[i].getKelas());
        }
    }
}
