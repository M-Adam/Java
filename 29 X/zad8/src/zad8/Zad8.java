package zad8;

public class Zad8 {

    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("Niewłaściwa ilość parametrów.");
            return;
        }
        
        double temp = Double.parseDouble(args[0]);
        boolean cels = true;
        
        switch (args[1].toLowerCase()) {
            case "c":
                cels = true;
                break;
            case "f":
                cels = false;
                break;
            default:
                System.out.println("Podano niewłaściwy drugi parametr (dozwolone: C, F)");
                return;
        }
        
        if(cels)
            System.out.println(temp + "C = "+ ((temp*1.8)+32.0) +"F");
        else       
            System.out.println(temp + "F = "+ (5.0/9.0*(temp-32.0)) +"C");     
    }
}