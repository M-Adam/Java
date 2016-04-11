package kolekcje;


public class OwnClass {

    public OwnClass(String name, int telephone) {
        this.name = name;
        this.telephone = telephone;
    }
    public String name;
    public int telephone;
    @Override
    public String toString(){
        return this.name+" "+this.telephone;
    }
}
