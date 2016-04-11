package biblioteka;

public class Ksiazka{
    public String tytul;
    public String autor;
    public boolean status;
   
    public Ksiazka(String tytul, String autor){
        this.tytul = tytul;
        this.autor = autor;
        this.status = false;
    }
}