package pertemuan2.Latihan3;
import javax.swing.JOptionPane;
/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Program {
    
   static void dataSiswa () {
       int jmlSw = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah siswa"));
       String dtSw [] = new String[jmlSw];
       
       for (int i = 0; i < dtSw.length; i++) {
           String nama = JOptionPane.showInputDialog("Masukan nama siswa ke- " + (i+1) );
           
       }
   }
   
   
}
