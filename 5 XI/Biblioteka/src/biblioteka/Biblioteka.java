package biblioteka;

public class Biblioteka {

    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("tytul K1", "autor K1");
        Ksiazka k2 = new Ksiazka("tytul K2", "autor K2");
        Wypozyczajacy w1 = new Wypozyczajacy("nazwisko W1", "imie W1");
        Wypozyczajacy w2 = new Wypozyczajacy("nazwisko W2", "imie W2");
        
        w1.wypozyczKsiazke(k2);
        w2.wypozyczKsiazke(k1);
        
        w1.zwroc(k2);
        w2.zwroc(k2);
        w2.zwroc(k1);
    }
}