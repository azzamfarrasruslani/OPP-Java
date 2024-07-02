package Tugas.Tugas1;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TestNotifikasi {
    public static void main(String[] args) {
        EmailNotification email = new EmailNotification();
        SMSNotification sms = new SMSNotification();
        
        
        email.sendMessage("19tiepbo@pcr.ac.id", "Sorry, there is "
                + "no give up word in my dictionarty");
        
        sms.sendMessage("+6200008888", "PBO id easy peasy");
        
    }
 
}
