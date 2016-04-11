package zad5;

import java.io.*;
import javax.swing.JOptionPane;

public class Zad5 {

    public static void main(String[] args) throws FileNotFoundException, IOException {        
        
        
        String plik = JOptionPane.showInputDialog("Podaj ścieżkę do pliku.");
        File f = new File(plik);
        if(!f.exists() || f.isDirectory()){
            System.out.println("Plik albo nie istnieje, albo... nie jest plikiem.");
            return;
        }
        
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        String nowaSciezka = getNewFilePath(f);
        
        try{
            fr = new FileReader(plik);
            fw = new FileWriter(nowaSciezka);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            
            Object[] arr = br.lines().toArray();
            
            String linijkaDoZapisu;
            for (int i = arr.length-1; i >= 0; i--) {
                linijkaDoZapisu = reverseLine(arr[i].toString());
                bw.write(linijkaDoZapisu);
                bw.newLine();
            }
            
        }
        catch(IOException io){
           System.out.println("Błąd IO");
        }
        finally{
            try{
                br.close();
                bw.close();
                fw.close();
                fr.close();
            }
            catch(IOException io){
                System.out.println("Błąd zamykania pliku.");
            }
        }       
    }
    
    private static String getNewFilePath(File f){
        String nazwaPliku = f.getName();
        StringBuilder sb = new StringBuilder(nazwaPliku);
        if(sb.indexOf(".")==-1){
            sb.reverse();
            return sb.toString();
        }
        
        nazwaPliku = sb.reverse().substring(sb.indexOf(".")+1, sb.length());
        
        String sciezka = f.getParent();
        
        return sciezka.concat("\\"+nazwaPliku+".txt");
    }
    
    private static String reverseLine(String str){
        String[] wyrazy = str.split(" ");
        
        StringBuilder sb = new StringBuilder();  
        for (int i = wyrazy.length-1; i >= 0; i--) 
            sb.append(wyrazy[i]).append(' ');
        
        return sb.toString();
    }
}