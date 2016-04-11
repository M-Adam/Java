package zad1;

public class Szafa{
    public Szuflada[] szuflady;
    private int wolnaSzuflada;
    private final int maxIloscSzuflad = 10;
   
    public Szafa(){
        this.szuflady = new Szuflada[maxIloscSzuflad];
        this.wolnaSzuflada = 0;
    }
   
    public void dodajSzuflade(Szuflada s){
        if(this.wolnaSzuflada > 9){
            System.out.println("Brak miejsca w szafie.");
            return;
        }
        this.szuflady[wolnaSzuflada] = s;
        this.wolnaSzuflada++;
    }
   
    public int ileSzuflad(){
        return this.wolnaSzuflada; 
    }
}