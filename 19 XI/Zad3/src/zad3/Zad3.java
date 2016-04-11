package zad3;

public class Zad3 {

    void ZglosWyjatek() throws Exception {
        if (new java.util.Random().nextInt(5) == 0) {
            throw new Exception();
        }
    }

    public static void main(String[] args) {
        Zad3 zad = new Zad3();
        try {
            zad.ZglosWyjatek();
            zad.ZglosWyjatek();
            zad.ZglosWyjatek();
            zad.ZglosWyjatek();
            zad.ZglosWyjatek();
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
}
