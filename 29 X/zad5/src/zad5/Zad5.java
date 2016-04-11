package zad5;

import java.util.Arrays;
import java.util.Random;

public class Zad5 {

    public static void main(String[] args) {
        int[] tab = new int[10];
        Random r = new Random();
                
        for(int i =0; i < tab.length; i++)
            tab[i] = r.nextInt(100);
        
        Arrays.sort(tab);
        
        for(int n:tab)
            System.out.print(n+" ");
    }
}