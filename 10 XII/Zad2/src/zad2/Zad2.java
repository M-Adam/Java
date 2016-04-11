package zad2;

import java.util.*;

public class Zad2 {
    
    public static void main(String[] args) {
        ArrayList<Kangaroo> kangury = new ArrayList<>();
        kangury.add(new Kangaroo(1, "Jacek"));
        kangury.add(new Kangaroo(2, "Wacek"));
        kangury.add(new Kangaroo(3, "Zdziś"));
        kangury.add(new Kangaroo(4, "Zbyś"));
        kangury.add(new Kangaroo(5, "Bonifacy"));
       
       
        for (int i = 0; i < kangury.size(); i++) 
             kangury.get(i).hop();
      
    }
}