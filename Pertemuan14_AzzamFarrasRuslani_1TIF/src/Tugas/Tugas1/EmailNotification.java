package Tugas.Tugas1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class EmailNotification implements Notifikasi{
    
    
    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim email ke: " + receiver + "dengan isi pesan : " + content);
    }
}
