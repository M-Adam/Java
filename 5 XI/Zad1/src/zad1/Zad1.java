package zad1;

public class Zad1 {
    
    public static void main(String[] args) {
        Szafa sz = new Szafa();
        sz.dodajSzuflade(new Szuflada(2));
        Szuflada szuf = new Szuflada(2);
        szuf.dodajUbranie(new Ubranie("szalik"));
        sz.dodajSzuflade(szuf);
        
        System.out.println(sz.ileSzuflad());
        System.out.println(szuf.ileUbran);
    }
}