package zad2;

import java.util.ArrayList;
import java.util.Comparator;


public class Zad2 {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        
        al.add(new Student ("Adam", 2, 3, 4));
        al.add(new Student ("Jarosław", 3, 4, 5));
        al.add(new Student ("Marek", 4, 4, 5));
        al.add(new Student ("Jakub", 5, 5, 5));
        al.add(new Student ("Bartosz", 2, 2, 5));
        al.add(new Student ("Robert", 2, 3, 3));
        al.add(new Student ("Grzegorz", 4, 3, 4));
        
        System.out.println("Przed sortowaniem.\nID, Imię, Średnia:");
        for(Student s : al)
            System.out.println(s.toString());
        
        Comparator c = Comparator.naturalOrder();
        al.sort(c);
        
        System.out.println("\n\nPo sortowaniu.\nID, Imię, Średnia:");
        for(Student s : al)
            System.out.println(s.toString());
    }
    
    
}
