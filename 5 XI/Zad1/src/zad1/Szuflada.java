package zad1;

public class Szuflada{
    public Ubranie[] ubrania;
    public int ileUbran;
   
    public Szuflada(int a){
        this.ubrania = new Ubranie[a];
        this.ileUbran = 0;
    }
   
    public void dodajUbranie(Ubranie u){
        if (this.ileUbran > this.ubrania.length){
            System.out.println("Brak miejsca w szulfadzie");
            return;
        }
        this.ubrania[ileUbran] = u;
        this.ileUbran++;
    }
}