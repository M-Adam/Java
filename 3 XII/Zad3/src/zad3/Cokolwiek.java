
package zad3;

public class Cokolwiek {
    public int a;
    private static int ind=0;
    
    public Cokolwiek(){
        this.a = ind;
        ind++;
    }
    
    @Override
    public String toString(){
        return Integer.toString(this.a);
    }
}
