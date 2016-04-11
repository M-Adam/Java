package zad3;

import java.io.*;

public class Zad3 {

    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        long start, stop;
        
 // FileReader       
        try {
            fr = new FileReader("tadeusz.txt");
            fw = new FileWriter("wy_fw.txt");
            
            int i;
            System.out.println("Rozpoczęto przepisywanie przy pomocy FileReader/Writer.");
            start = System.nanoTime();
            while((i = fr.read()) != -1){
                fw.write(i);
            }
            stop = System.nanoTime();
            
            System.out.println("Przepisanie przy pomocy FileReader i FileWriter trwało: "+(stop-start));
        } catch (FileNotFoundException ex) {
            System.out.println("Brak pliku");
        }
        catch(IOException io){
            System.out.println("Blad IO");
        }
        finally{
            try{
                fr.close();
                fw.close();
            }
            catch(IOException io){
                System.out.println("Błąd zamykania pliku");
            }
        }
           
// BufferedReader
        try{
            fr = new FileReader("tadeusz.txt");
            fw = new FileWriter("wy_bw.txt");
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            
            int i;
            System.out.println("\nRozpoczęto przepisywanie przy pomocy BufferedReader/Writer.");
            start = System.nanoTime();
            while((i=br.read())!=-1){
                bw.write(i);
            }
            stop = System.nanoTime();
            System.out.println("Przepisanie przy pomocy BufferedReader i BufferedWriter trwało: "+(stop-start));
        }
        catch(FileNotFoundException ex){
            System.out.println("Nie znaleziono pliku.");
        }
        catch( IOException io){
            System.out.println("Bład IO");
        }
        finally{
            try{
                br.close();
                bw.close();
                fr.close();
                fw.close();
                
            }
            catch(IOException io){
                System.out.println("Błąd zamykania pliku");
            }
        }
    }
}