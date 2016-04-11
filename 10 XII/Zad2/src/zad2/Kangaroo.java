package zad2;

public class Kangaroo {
    private String kangName;
    private int kangNR;

    public Kangaroo(int kangNR, String kangName) {
        this.kangName = kangName;
        this.kangNR = kangNR;
    }
    
    @Override
    public String toString(){
        return ("Nr kangura: "+kangNR+". Nazwa kangura: "+kangName);
    }
    
    public void hop(){
        System.out.println("Kangur imieniem "+this.kangName+", o numerze "+this.kangNR+" podskakuje!");
    }    
}