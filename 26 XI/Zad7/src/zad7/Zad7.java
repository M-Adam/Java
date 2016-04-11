package zad7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

public class Zad7 {

    public static void main(String[] args) throws IOException {
        String katalog = JOptionPane.showInputDialog("Podaj ścieżkę do katalogu.");
        File f = new File(katalog);
        if(!f.exists() || f.isFile()){
            System.out.println("Katalog albo nie istnieje, albo... nie jest katalogiem.");
            return;
        }
        
        String slowo = JOptionPane.showInputDialog("Podaj szukane slowo.");
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            Stream<Path> filter = Files.walk(Paths.get(katalog)).filter(Files::isRegularFile);
            Object[] arr = filter.toArray();
            long wSumie = 0, ilosc;
            String fileName;
            
            fw = new FileWriter(slowo+".txt");
            bw = new BufferedWriter(fw);
            String headline = "Znaleziony plik tekstowy | liczba wystąpień szukanego słowa:";
            System.out.println(headline);
            bw.write(headline);
            bw.newLine();
            for (Object o:arr) {
                fileName = ((Path)o).toFile().getName();
                if(fileName.endsWith(".txt")){
                    ilosc = szukajSlow(((Path)o).toFile(), slowo);
                    System.out.println(fileName+" | "+ilosc);
                    bw.write(fileName+" | "+ilosc);
                    bw.newLine();
                    wSumie+=ilosc;
                }
            }
            bw.newLine();
            bw.write("W sumie: "+wSumie);
            
            bw.close();
            fw.close();
            
            System.out.println("W sumie znaleziono "+wSumie+" wystąpień słowa \""+slowo+"\"\nWyniki zapisano w pliku "+slowo+".txt");
            
        } catch (IOException ex) {
            System.out.println("Problem IO");
        }
    }
    

    private static long szukajSlow(File f, String szukaneSlowo) {
        FileReader fr = null;
        BufferedReader br = null;
        
        long ilosc=0;
        
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String linijka;
            String[] wyrazy;
            while((linijka = br.readLine()) != null){
                wyrazy = linijka.split(" ");
                for(String str:wyrazy)
                    if(str.equalsIgnoreCase(str))
                        ilosc++;
            }
        } catch (IOException ex) {
            System.out.println("Błąd IO");
        }
        finally{
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                System.out.println("Błąd przy zamykaniu pliku");
            }
        }
        
        return ilosc;
    }
}