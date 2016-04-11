package zad2;

public class Punkt{
    private double x;
    private double y;
   
    public Punkt(){
        this.x = 0;
        this.y = 0;
    }
   
    public void zeruj(){
        this.y = 0;
        this.x = 0;
    }
   
    public void przesun(){
        this.y += 3;
        this.x += 3;
    }
   
    public void wyswietl(){
        System.out.println("wspolrzedne Punktu: "+ this.x +" "+ this.y);
    }
}