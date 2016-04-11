package zad5;


public class Demo {
    private int zewn = 1;
    private void wyswietlZewn(){
        System.out.println(this.zewn);
    }
    
    public class wewnDemo{
        public void mod(){
            zewn = 2;
            wyswietlZewn();
        }
    }
    
    public void stworzWewn(){
        wewnDemo wd = new wewnDemo();
        wd.mod();
    }
}
