package itproger;

public class Transport {

    /**
     * Атрибути
      */
    protected String typ;
    protected float speed;
    protected int weight;
    protected String color;
    protected float wheelRadius;


    /**
     * Конструктор
     */
    public Transport() {
    }

    public Transport (String typ, float speed, int weight, String color) {
        this.typ = typ;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public Transport(String typ, float speed, int weight, String color, float wheelRadius) {
        setValues(typ, speed, weight, color, wheelRadius);
        System.out.println(getValues());
    }


    /**
     * Функція або Метод
      */
    public void setValues(String typ, float speed, int weight, String color, float wheelRadius) {
        this.typ = typ;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.wheelRadius = wheelRadius;
    }

    public String getValues() {
        String info = "Auto typ: " + typ + "\n" + "Object speed: " + speed + ". \nWeight: " + weight + ". \nColor: " + color + ". \nWleel Radius: " + wheelRadius + ".";
        return info;
    }

}
