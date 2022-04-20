
package galeriaprojekt;
import java.util.ArrayList;
public class GaleriaProjekt {


    public static void main(String[] args) {
        ArrayList<String> cim = new ArrayList<String>();
        ArrayList<String> keszito = new ArrayList<String>();
        
        keszito.add("Kovács Győző");
        keszito.add("Szabó János");
        
        cim.add("Háttér");
        cim.add("Kisállat");
        
        Modell m1 = new Modell();
        System.out.print(keszito);
 
    }
    
}
