
package Interface.Percobaan3;

/**
 *
 * @author Admin
 */
public class TelevisiB implements Control{
     String[] channelTV = {"TVRI", "LA TV", "TV 7", "RCTI", "SCTV"};
     
      public void pindahChannel(int channel) {
        System.out.println("Pindah channel pada tv B ke : " + channelTV[channel]);
    }
   
    public void perbesarVolume (int intensitas) {
        System.out.println("Perbesar itensitas volume pada tv B sebanyak : " + intensitas);
    }
    
    public void perkecilVolume (int intensitas) {
        System.out.println("Perkecil itensitas volume pada tv B sebanyak : " + intensitas);
    }
}
