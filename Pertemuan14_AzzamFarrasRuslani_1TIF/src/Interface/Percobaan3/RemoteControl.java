package Interface.Percobaan3;

/**
 *
 * @author Admin
 */
public class RemoteControl {

    public static final int PINDAH_CHANNEL = 1;
    public static final int PERBESAR_VOLUME = 2;
    public static final int PERKECIL_VOLUME = 3;

    public void kirimPerintahKeTv(int aksi, Control tv, int tombol) {
        switch (aksi) {
            case PINDAH_CHANNEL:
                tv.pindahChannel(tombol);
                break;
            case PERBESAR_VOLUME: 
                tv.perbesarVolume(tombol);
                break;
            case PERKECIL_VOLUME:
                tv.perkecilVolume(tombol);
                break;
        }
    }
}
