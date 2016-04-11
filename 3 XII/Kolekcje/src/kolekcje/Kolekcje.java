package kolekcje;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Kolekcje {

    

    public static void main(String[] args) {
        System.out.println("HashSet: ");
        hs();
        System.out.println();
        System.out.println("ArrayList: ");
        al();
        System.out.println();
        System.out.println("LinkedHashSet: ");
        lhs();
    }
    
    /**
     * HashSet - implementacja pojęcia zbioru. Stały dostęp do elementów. 
     * Kolejność elementów nie ustalona.
     */
    private static void hs(){
        HashSet hs = new HashSet();
        hs.add("napis1");
        hs.add("napis2");
        hs.add(new OwnClass("jakies imie", 1234));
        hs.add(new OwnClass("inne imie", 5678));
        Integer a = 5,b = 10,c = 15;
        hs.add(a);
        hs.add(b);
        hs.add(c);
        
        Iterator i = hs.iterator();
        for(Object o:hs){
            if(!i.hasNext())
                break;
            System.out.println(i.next().toString());
        }
    }

    /**
     * ArrayList - najczęściej używana implementacja intefejsu List.
     * Przechowuje obiekty w kolejności ich dodania
     */
    private static void al() {
        ArrayList al = new ArrayList();
        al.add("napis1");
        al.add("napis2");
        al.add(new OwnClass("jakies imie", 1234));
        al.add(new OwnClass("inne imie", 5678));
        Integer a = 5,b = 10,c = 15;
        al.add(a);
        al.add(b);
        al.add(c);
        
        Iterator i = al.iterator();
        for(Object o:al){
            if(!i.hasNext())
                break;
            System.out.println(i.next().toString());
        }
    }

    /**
     * Rozszerzenie klasy HashSet. Nie można dodać duplikatu elementu już znajdującego się w kolekcji.
     * Zachowuje kolejność dodanych elementów.
     */
    private static void lhs() {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("napis1");
        lhs.add("napis2");
        lhs.add(new OwnClass("jakies imie", 1234));
        lhs.add(new OwnClass("inne imie", 5678));
        Integer a = 5,b = 10,c = 15;
        lhs.add(a);
        lhs.add(b);
        lhs.add(c);
        
        Iterator i = lhs.iterator();
        for(Object o:lhs){
            if(!i.hasNext())
                break;
            System.out.println(i.next().toString());
        }
    }
    
}
