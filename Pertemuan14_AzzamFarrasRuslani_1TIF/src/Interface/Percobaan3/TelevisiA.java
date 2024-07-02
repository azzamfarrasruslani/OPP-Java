package Interface.Percobaan3;

/**
 *
 * @author Admin
 */
public class TelevisiA implements Control {

    String[] channelTV = {"RCTI", "SCTV", "INDOSIAR", "TRANS TV", "TPI"};

   public void pindahChannel(int channel) {
        System.out.println("Pindah channel pada tv A ke : " + channelTV[channel]);
    }
   
    public void perbesarVolume (int intensitas) {
        System.out.println("Perbesar itensitas volume pada tv A sebanyak : " + intensitas);
    }
    
    public void perkecilVolume (int intensitas) {
        System.out.println("Perkecil itensitas volume pada tv A sebanyak : " + intensitas);
    }
}
