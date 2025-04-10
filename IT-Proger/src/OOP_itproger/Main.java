package OOP_itproger;

import OOP_itproger.db.*;

public class Main {
    public Main () {

    }

    public static void main(String[] args) {



        Car bmw = new Car (200.5f, 2000, "Black", new byte[] {0, 0, 0});
        bmw.lightInfo();
        bmw.setLight(true);
        bmw.lightInfo();
        bmw.engine.setValues(false, 200);
        bmw.engine.info();
//        bmw.speed = 200.5f;
//        bmw.weight = 2000;
//        bmw.color = "Black";
//        bmw.coordinates = new byte[] {0, 0, 0};

//        bmw.setValues(200.5f, 2000, "Black", new byte[] {0, 0, 0});

        Truck truck = new Truck (130f, 5000, "White", true);
        truck.engine.setValues(true, 1);
        truck.engine.info();
//        truck.moveObject();
//        truck.setValues(130f, 5000, "White", new byte[] {0, 100, 0}, true);
//        System.out.println(truck.getValues());


        Car flyCar = new Car(260.8f, 3200, "Red", new byte[] {0, 10, 0}) {
            @Override
            public String getValues () {
                return "Fly Car";
            }

            @Override
            public void moveObject() {
                System.out.println("Object is flying");
            }
        };
        flyCar.moveObject();

        DB db = new DB();

        final int num = 10;

        Person obj1 = new Person();
        Person obj2 = new Person();
        Person obj3 = new Person();
        Person.GetCount();
//        Person.count = 10;
//        System.out.println();

        add(5, 7);
        add(5, 7, 6);
        add(5.5f, 7.3f);
        add("Hi ", "World!");
    }

    public static void add(int a, int b) {
            int res = a + b;
            System.out.println("Res: " + res);
    }

    public static void add(float a, float b) {
        float res = a + b;
        System.out.println("Res: " + res);
    }

    public static void add(String a, String b) {
        String res = a + b;
        System.out.println("Res: " + res);
    }

    public static void add(int a, int b, int y) {
        int res = a + b + y;
        System.out.println("Res: " + res);
    }


}

