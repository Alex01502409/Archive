package singleton;

public class Singleton {

    private Singleton() {
        System.out.println("Hallo Mittweida");
    }

    private static final Singleton OBJ = new Singleton();

    public static Singleton getInstance() {
        return OBJ;
    }

}
