package itproger;

public class Lkw extends Transport {


    /**
     * Атрибут
      */
    private boolean isLoaded;


    /**
     * Методи
      */
    public Lkw (String typ, float speed, int weight, String color, boolean isLoaded) {
        super(typ, speed, weight, color);
        this.isLoaded = isLoaded;
        
    }

    public void setValues(String typ, float speed, int weight, String color, float wheelRadius, boolean isLoaded) {
        super.typ = typ;
        super.speed = speed;
        super.weight = weight;
        super.color = color;
        super.wheelRadius = wheelRadius;
        this.isLoaded = isLoaded;
    }

    @Override
    public String getValues() {
        String info = super.getValues();
        return info + "\n" + getLoaded();
    }

    public void setLoaded(boolean isLoaded) {
        this.isLoaded = isLoaded;
    }

    public String getLoaded() {
        if(isLoaded) {
            return "Lkw is loaded";
        } else {
            return "Lkw is NOT Loaded";
        }
    }
}
