package Tugas.Tugas1;





/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class SMSNotification implements Notifikasi{
    @Override
     public void sendMessage(String receiver, String content) {
         System.out.println("Mengirim sms ke: " + receiver + "dengan isi pesan : " + content);
     }
}
