package zad2;

import java.io.*;
import javax.swing.JOptionPane;

public class Zad2 {

    public static void main(String[] args) {
        File f;
        String sciezka = JOptionPane.showInputDialog("Podaj ścieżkę:");
        f = new File(sciezka);
        
        if(f.isFile()){
            long wielkosc = f.getTotalSpace();
            String nazwa = f.getName();
            long mod = f.lastModified();
            System.out.println("Informacje o pliku:\nNazwa: "+nazwa+"\nWielkość: "+wielkosc+"\nData Modyfikacji: "+mod);
        }
        else if (f.isDirectory()){
            String[] lista = f.list();
            System.out.println("Podany katalog zawiera: ");
            for (String s:lista) {
                System.out.println(s);
            }
        }
        else   
            System.out.println("Coś poszło nie tak...");
    }
}