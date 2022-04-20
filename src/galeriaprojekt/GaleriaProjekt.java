
package galeriaprojekt;
import java.util.ArrayList;
import java.util.Collections;
public class GaleriaProjekt {


    public static void main(String[] args) {
        ArrayList<String> cim = new ArrayList<String>();
        ArrayList<String> keszito = new ArrayList<String>();
        
        keszito.add("Kovács Győző");
        keszito.add("Szabó János");
        
        cim.add("Háttér");
        cim.add("Kisállat");
        
        Modell m = new Modell();
        for (String string: cim) {
            Collections.sort(cim);
        }
        for (String string: cim) {
            Collections.sort(keszito);
        }
        for (String string: cim){
        System.out.print(keszito);
        System.out.print(cim);
        }
    }
    
}
