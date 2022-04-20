
package galeriaprojekt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


import java.util.Date;


public class Modell {
    public Date datum = new Date(); 
    File fajl = new File("kiallitasitargyak.txt");

    public void megjelenit(){
        
    }
    public Date getDatum() {
        return datum;
    }
    public File getFajl() {
        return fajl;
    }
   
 
public class Galeria{
    public void felvetel() throws IOException{
        ArrayList<KiallitasiTargy> targy = new ArrayList();
        Files.readAllLines(Paths.get("..\\kiallitasitargyak.txt"));
        
        KiallitasiTargy k1 = new KiallitasiTargy() {}; 
    }
    
        
    }
abstract class KiallitasiTargy{
public class Festmeny{
  
}   
}

    
    @Override
    public String toString() {
        return "Modell{" + "datum=" + datum + ", fajl=" + fajl + '}';
    }
  
}


