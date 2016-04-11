package zad4;


public class Uczen {
    int[] oceny = new int[3];
    Uczen(int a, int b, int c){
        try{
        this.ustawOceny(a, b, c);
        }
        catch(ZlaOcenaException zoe){
            System.out.println(zoe.toString());
        }
    }
    public void ustawOceny(int a, int b, int c) throws ZlaOcenaException {
        if(a<1 || a>6 || b<1 || b>6 || c<1 || c>6) 
            throw new ZlaOcenaException();
        
        this.oceny[0] = a;
        this.oceny[1] = b;
        this.oceny[2] = c;
    }
    
}
