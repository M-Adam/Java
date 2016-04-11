package zad1;

// Zadanie 1 i 2

import java.util.Random;
import javax.swing.JOptionPane;

public class Zad1 {

    public static void main(String[] args) {
        // Zadanie 1
        String input = JOptionPane.showInputDialog(null, "Podaj dzielnik");
        int dzielna = 5;
        int dzielnik = Integer.parseInt(input);
        int wynik;
        
        try{
            wynik = 5/dzielnik;
        }
        catch(NumberFormatException nfe){
            nfe.printStackTrace();
            throw new NumberFormatException();
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();
            throw new ArithmeticException();
        }
        
        // Zadanie 2
        try{
            zglosLosowy();
        }
        catch(WyjatekPierwszy wp){
            System.out.println(wp.toString());
        }
        catch(WyjatekDrugi wd){
            System.out.println(wd.toString());
        }
        catch(WyjatekTrzeci wt){
            System.out.println(wt.toString());
        }
    }
    
    public static void zglosLosowy() throws WyjatekPierwszy, WyjatekDrugi, WyjatekTrzeci{
        Random r = new Random();
        int los = r.nextInt(3);
        switch(los){
            case 0:
                throw new WyjatekPierwszy();
            case 1:
                throw new WyjatekDrugi();
            case 2:
                //throw new WyjatekTrzeci();
                
                //Metody wywołujące zglosLosowy() wciąż muszą obsługiwać WyjątekTrzeci, mimo, że zglosLosowy() go nie zwraca
        }
    }
    
}
