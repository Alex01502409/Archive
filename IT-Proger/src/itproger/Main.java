package itproger;

public class Main {

    public static void main(String[] args) {

        Pkw bmw = new Pkw("Auto",280.5f, 2000, "Black", 20);

        Lkw volvo = new Lkw("Track",130f, 5000, "White", true);
        volvo.setValues("Track", 130f, 5000, "White", 45, true);
        System.out.println("\n" +  volvo.getValues());
        volvo.getLoaded();
        volvo.setLoaded(false);
        volvo.getLoaded();

    }
}