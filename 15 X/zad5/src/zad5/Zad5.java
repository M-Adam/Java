/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author student
 */
public class Zad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj imie: ");
        String imie = BR.readLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = BR.readLine();
        System.out.println("Podaj wiek");
        int wiek = Integer.parseInt(BR.readLine());
        System.out.println("Nazywasz się "+ imie+" "+nazwisko+" i masz "+wiek+" lat.");
        if(wiek>40)
            System.out.println("Powinieneś przeprowadzic badania okresowe");
        else
            System.out.println("Nie musisz przeprowadzac badan okresowych");
    }
    
}
