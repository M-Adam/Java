package zad2;

public class Zad2 {

    public static void main(String[] args) {
        int[] tab = new int[20];
        
        for(int i = 0; i< tab.length; i++)
            tab[i] = i;
        
        for(int n:tab)
            System.out.print(n+" ");
    }
}