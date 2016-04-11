package biblioteka;

public class Wypozyczajacy{
    public String nazwisko;
    public String imie;
    public Ksiazka ksiazka;
   
    public Wypozyczajacy(String nazwisko, String imie){
        this.nazwisko = nazwisko;
        this.imie = imie;
    }
    
    public void wypozyczKsiazke(Ksiazka k){
        if(k.status){
            System.out.println("Ksiazka "+ k.tytul+" niedostepna.");
            return;
        }
        k.status=true;
        this.ksiazka = k;
        System.out.println("Ksiazka "+k.tytul+" zostala wlasnie wypozyczona");
    }
    
    public void zwroc(Ksiazka k){
        if(!this.ksiazka.equals(k)) {
            System.out.println("To nie ta ksiazka!");
            return;
        }
        
        
        k.status = false;
        this.ksiazka=null;
        System.out.println("Ksiazka "+k.tytul+" zostala oddana.");
    }
}