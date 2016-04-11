/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author adamm
 */
public class Zad9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Dla równań w postaci:\n"
                + "Ax + By = E\n"
                + "Cx + Dy = F\n"
                + "podaj kolejne współczynniki.");
        
        System.out.println("\nPierwsze równanie:");
        System.out.print("A = ");
        double a = Integer.parseInt(bf.readLine());
        System.out.print("B = ");
        double b = Integer.parseInt(bf.readLine());
        System.out.print("E = ");
        double e = Integer.parseInt(bf.readLine());
        
        System.out.println("\nDrugie równanie:");
        System.out.print("C = ");
        double c = Integer.parseInt(bf.readLine());
        System.out.print("D = ");
        double d = Integer.parseInt(bf.readLine());
        System.out.print("F = ");
        double f = Integer.parseInt(bf.readLine());
        
        double x = (e*d - b*f)/(a*d - b*c);
        double y = (a*f - e*c)/(a*d - b*c);
        
        System.out.println("\nX = "+x);
        System.out.println("Y = "+y);
    }
    
}
