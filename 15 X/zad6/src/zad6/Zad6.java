/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author student
 */
public class Zad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj liczbe do zbadania.");
        int number = Integer.parseInt(bf.readLine());
        
            
        if(isPerfect(number))
            System.out.println("Liczba "+number+" jest liczbą doskonałą");
        else
            System.out.println("Liczba "+number+" nie jest liczbą doskonałą");
    }
    
    private static boolean isPerfect(int number){
        int sum=0;
        for (int i = 1; i <= number/2; i++) {
            if(number%i==0)
                sum+=i;
        }
        
        return (number==sum);
    }
    
}
