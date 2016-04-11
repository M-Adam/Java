package zad4;

public class Zad4 {

    public static void main(String[] args) {
        String days[] = {"Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek"};
        
        System.out.println("Wersja podstawowa: ");
        for(int i =0; i<days.length; i++)
            System.out.print(days[i] + " ");
        
        System.out.println("\nWersja rozszerzona: ");
        for(String str:days)
            System.out.print(str+" ");
    }
    
}
