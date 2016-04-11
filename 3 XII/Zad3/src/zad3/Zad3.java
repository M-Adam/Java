package zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Zad3 {

   
    public static void main(String[] args) {
        Cokolwiek[] cokTab = new Cokolwiek[10];
        for (int i = 0; i < cokTab.length; i++) {
            cokTab[i] = new Cokolwiek();
        }
        
        
        List<Cokolwiek> lista = new ArrayList<Cokolwiek>(10);
        
        lista.addAll(Arrays.asList(cokTab));
        
        List<Cokolwiek> subLista = new ArrayList<Cokolwiek>();
        subLista = lista.subList(3, 6);
            
        System.out.println("Pełna lista: ");
        for(Cokolwiek c : lista){
            System.out.println(c.toString());
        }
        
        lista.removeAll(subLista);
        System.out.println("Po usunięciu subListy: ");
        for(Cokolwiek c : lista){
            System.out.println(c.toString());
        }
    }
    
}
