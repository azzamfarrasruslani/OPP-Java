package Interface.Percobaan3;

/**
 *
 * @author Admin
 */
public class TestInterface {

    public static void main(String[] args) {
        TelevisiA tvA = new TelevisiA();
        TelevisiB tvB = new TelevisiB();
        RemoteControl rc = new RemoteControl();

        //kirim perintah ke tv A
        rc.kirimPerintahKeTv(RemoteControl.PINDAH_CHANNEL, tvA, 2);
        rc.kirimPerintahKeTv(RemoteControl.PERBESAR_VOLUME, tvA, 5);

        //kirin perintah ke tv B
        rc.kirimPerintahKeTv(RemoteControl.PINDAH_CHANNEL, tvB, 1);
        rc.kirimPerintahKeTv(RemoteControl.PERKECIL_VOLUME, tvB, 5);
    }
}
