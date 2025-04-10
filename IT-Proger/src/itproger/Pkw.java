package itproger;

public class Pkw extends Transport {

    public Pkw(String typ, float speed, int weight, String color, float wheelRadius) {
        setValues(typ, speed, weight, color, wheelRadius);
        System.out.println("\n" + getValues());

    }
}
