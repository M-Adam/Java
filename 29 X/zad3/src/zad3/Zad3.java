package zad3;

public class Zad3 {

    public static void main(String[] args) {
        int tab[][] = new int[10][5];
        
        for(int i = 0; i<tab.length; i++){
            System.out.print((i+1) +" wiersz: ");
        
            for(int j = 0; j < tab[i].length; j++){
                tab[i][j] = i*j;
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();           
        }      
    } 
}