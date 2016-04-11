/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author student
 */
public class Zad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int a = 1, b=3, c=2;
        double d = 4.5;
        char e = 'A';
        System.out.println(Math.max(a, Math.max(b, c)));
        System.out.println(d + " "+ e);
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj imie: ");
        String imie = BR.readLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = BR.readLine();
        System.out.println("Nazywasz się "+ imie+" "+nazwisko);
    }
    
}
