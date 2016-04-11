package zad9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad9 {

    public static void main(String[] args) throws IOException {
        if(args.length != 1){
            System.out.println("Błędna ilość argumentów");
            return;
        }
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int len = Integer.parseInt(args[0]);
              
        StringBuilder sb = new StringBuilder("");
        
        while(len < input.length()) {
            sb.append(input.substring(0, len)).append("\n");
            input = input.substring(len);
        }
        sb.append(input);
        
        System.out.println(sb.toString());
    }
}