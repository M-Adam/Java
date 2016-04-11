package zad1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Watek extends Thread {
    public int nrWystapienia, nrWatku;
    
    public void run(){
        while(true){
            System.out.println("Watek nr "+nrWatku+" wystapienie "+nrWystapienia);
            nrWystapienia++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Watek.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        
    public Watek(int nrWatku){
        this.nrWatku = nrWatku;
    }
}