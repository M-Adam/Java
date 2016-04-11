package zad4;

import java.io.*;
import java.util.Arrays;

public class Zad4 {

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        try{
            fr = new FileReader("tadeusz.txt");
            fw = new FileWriter("wy.txt");
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            
            String wers;
            String[] wyrazy;
            while((wers = br.readLine())!=null){
                wyrazy = wers.split(" ");
                Arrays.sort(wyrazy);
                for(String str:wyrazy){
                    bw.write(str);
                    bw.write(' ');
                }
                bw.newLine();
            } 
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