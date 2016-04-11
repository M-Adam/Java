/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author student
 */
public class Zad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj dolną granicę.");
        int dol = Integer.parseInt(bf.readLine());
        System.out.println("Podaj górną granicę.");
        int gora = Integer.parseInt(bf.readLine());
        
        System.out.println("\nLiczby pierwsze:");
        for (int i = dol; i <= gora; i++) {
            if(pierwsza(i))
                System.out.print(i+" ");
        }
    }
    
    public static boolean pierwsza(int liczba){
        if (liczba <= 1) return false;
        for (int i = 2; i <= liczba/2; i++) {
            if(liczba%i==0)
                return false;
        }
        return true;
    }
    
}
