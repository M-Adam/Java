package zad6;

import java.io.*;
import javax.swing.JOptionPane;

public class Zad6 {

    public static void main(String[] args) {
        String plik = JOptionPane.showInputDialog("Podaj ścieżkę do pliku.");
        File f = new File(plik);
        if(!f.exists() || f.isDirectory()){
            System.out.println("Plik albo nie istnieje, albo... nie jest plikiem.");
            return;
        }
        
        FileReader fr = null;
        BufferedReader br = null;
        
           
        try{
            fr = new FileReader(plik);
            br = new BufferedReader(fr);
            
            
            Object[] arr = br.lines().toArray();
            
            String linijkaDoZapisu;
            for (int i = arr.length-1; i >= 0; i--) {
                wyrazyIZnakiWLinii(arr[i].toString());
                Statystyka.linie++;
            }
            
            System.out.println("W zadanym pliku występuje:\n"+Statystyka.linie+" linii,\n"+Statystyka.wyrazy+" wyrazów\n"+Statystyka.litery+" znaków.");
        } catch (FileNotFoundException ex) {
            System.out.println("Brak pliku");        
        }
        finally{
            try{
                br.close();
                fr.close();
            }
            catch(IOException io){
                System.out.println("Błąd przy zamykaniu pliku");
            }
        }
    }

    private static void wyrazyIZnakiWLinii(String str) {
        Statystyka.litery+=str.length();
        String[] tab = str.split(" ");
        Statystyka.wyrazy+=tab.length;
    }
    
}

