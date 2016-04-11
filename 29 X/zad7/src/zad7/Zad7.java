package zad7;

public class Zad7 {

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Nie podano żadnego argumentu");
            return;
        }
        
        System.out.println("Parametry:");
        
        for (int i = 0; i < args.length; i++) 
            System.out.println((i+1)+". parametr: "+args[i]);
    }   
}