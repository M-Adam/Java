package zad1;

import java.io.*;

public class Zad1 {
    
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        try{
            fr = new FileReader("plik_we.txt");
            fw = new FileWriter("plik_wy.txt");
            br = new BufferedReader(fr);           
            bw = new BufferedWriter(fw);
            
            int i;
            while((i=br.read())!= -1){
                bw.write(i+2);
            }
        }
        catch(FileNotFoundException fn){
            System.out.println("Nie znaleziono pliku");
        }
        catch(IOException io){
            System.out.println("Blad IO");
        }
        catch(Exception e){
            System.out.println("Inny wyjatek");
        }
        finally{
            try{
                br.close();
                bw.close();
                fr.close();
                fw.close();
            }
            catch(IOException io){
                System.out.println("Blad zamykania pliku");
            }
        }
        
        System.out.println("Zrobione.");
    }
}