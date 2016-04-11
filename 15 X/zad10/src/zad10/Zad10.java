package zad10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad10 {

    public static void main(String[] args) throws IOException {
        if(args.length != 1){
            System.out.println("Błędna ilość argumentów");
            return;
        }
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();
        int len = Integer.parseInt(args[0]);
              
        
        String[] arr = input.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()>=len)
                sb.append(arr[i]).append('\n');
            else{
                int j;
                int ile = ileSlow(arr, len, i);
                for (j = i; j < i+ile && j<arr.length ; j++) {
                    sb.append(arr[j]);
                }
                sb.append('\n');
                i=j-1;
            }
        }
        System.out.println(sb.toString());
    } 
    
    public static int ileSlow(String[] arr, int len, int start){
        int sumaSlow = 0, sumaDlugosci = 0;
        for (int i = start; i < arr.length && sumaDlugosci<=len; i++) {
            sumaDlugosci+=arr[i].length();
            sumaSlow++;
        }
        if (sumaDlugosci > len) return sumaSlow-1;
        else return sumaSlow;
    }
}