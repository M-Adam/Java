package zad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Zad4 {

    public static HashSet<String> zb1 = new HashSet<String>();
    public static HashSet<String> zb2 = new HashSet<String>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char rozkaz;
        System.out.println("Co chcesz zrobić?\n1. Dodać hasło do pierwszego zbioru.\n2. Dodać hasło do drugiego zbioru\n3. Usunąć hasło z pierwszego zbioru\n4. Usunąć hasło z drugiego zbioru.\n5. Wypisać sumę zbiorów.\n6. Wypisać różnicę zbiorów. \n7. Wypisać iloczyn zbiorów.\n8. Wyjść.\n");
        
        while(true){
            rozkaz = (char) br.read();
            wywolajPolecenie(rozkaz);
        }
    }
    
    private static void wywolajPolecenie(char rozkaz) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String haslo;
        switch(rozkaz){
            case '1':
                System.out.println("Podaj haslo do dodania.");    
                haslo = br.readLine();
                zb1.add(haslo);
                break;
            case '2':
                System.out.println("Podaj hasło do dodania.");
                haslo = br.readLine();
                zb2.add(haslo);
                break;
            case '3':
                System.out.println("Podaj haslo do usuniecia");
                zb1.remove(br.readLine());
                break;
            case '4':
                System.out.println("Podaj haslo do usuniecia");
                zb2.remove(br.readLine());
                break;
            case '5':
                HashSet<String> tegoNie = new HashSet<String>();
                for(String s:zb1){
                    if(zb2.contains(s)){
                        tegoNie.add(s);
                        
                    }
                    System.out.print(s+" ");
                }
                for(String s:zb2){
                    if(tegoNie.contains(s))
                        continue;
                    else
                        System.out.print(s+ " ");
                }
                System.out.println();
                break;
            case '6':
                for(String s:zb1){
                    if(zb2.contains(s))
                        continue;
                    System.out.print(s+" ");
                }
                System.out.println();
                break;
            case '7':
                for(String s:zb1)
                    if (zb2.contains(s))
                        System.out.print(s+" ");
                System.out.println();
                break;
            case '8':
                System.exit(0);
                break;
        }
        
    }
}