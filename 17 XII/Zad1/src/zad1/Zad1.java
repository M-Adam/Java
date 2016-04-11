package zad1;

import java.io.*;
import java.time.LocalDateTime;

public class Zad1 {

    // transient powoduje wyłączenie składowej klasy z procesu serializacji
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       Czas c = new Czas();
        
        String sciezka = "d:\\czas.ser";
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(sciezka)));
        out.writeObject(c);
        out.close();
        
        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(sciezka)));
        Czas stary = (Czas)in.readObject();
        in.close();
        System.out.println(stary.toString());
        
        
        System.out.println("teraz: "+LocalDateTime.now());
    }
    
}
