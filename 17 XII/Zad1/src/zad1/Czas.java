package zad1;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Czas implements Serializable {
    private LocalDateTime czas;

    public LocalDateTime getCzas() {
        return czas;
    }

    public void setCzas(LocalDateTime czas) {
        this.czas = czas;
    }

    public Czas() {
        this.czas = LocalDateTime.now();
    }
    
    @Override
    public String toString(){
        return super.toString()+"\n"+this.czas.toString();
    }
}
