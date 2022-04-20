
package galeriaprojekt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


import java.util.Date;


public class Modell {
    public Date datum = new Date(); 
    File fajl = new File("kiallitasitargyak.txt");

   
 
public class Galeria{
    public void felvetel() throws IOException{
       
        Files.readAllLines(Paths.get("..\\kiallitasitargyak.txt"));
    }
 if()
        
    } 
public abstract class KiallitasiTargy{
    
}
public class Festmeny{
  
}
    public Date getDatum() {
        return datum;
    }
    public File getFajl() {
        return fajl;
    }
    @Override
    public String toString() {
        return "Modell{" + "datum=" + datum + ", fajl=" + fajl + '}';
    }
  
}


