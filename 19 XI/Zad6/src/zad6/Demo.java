package zad6;


public class Demo {
    private int zewn = 1;
    public class DemoWewn{
        private int wewn = 2;
        DemoWewn(){
            System.out.println("Tu klasa wewn.");
        }
        
        public void wyswZewn(){
            System.out.println(zewn);
            //Mozna wyswietlić prywatne składowe klasy zewnętrznej
        }
    }
    
    public void wyswWewn(){
        //System.out.println(wewn);
        //Nie można wyświetlić prywatnych składowych klasy wewnętrznej
    }
    
}
