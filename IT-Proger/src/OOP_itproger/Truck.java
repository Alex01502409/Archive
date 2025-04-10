package OOP_itproger;

public final class Truck extends Transport {
    /**
     * Attribute
     */
    private boolean isLoaded;

    /**
     * Konstruktor
     */
    public Truck (float speed, int weight, String color, boolean isLoaded) {
        super(speed, weight, color);
        this.isLoaded = isLoaded;
//        System.out.println(super.getValues());
    }

    /**
     * Methode
     */
    public void setValues (float speed, int weight, String color, byte[] coordinates, boolean isLoaded) {
        super.speed = speed;
        super.weight = weight;
        super.color = color;
        super.coordinates = coordinates;
        this.isLoaded = isLoaded;
    }

    @Override
    public String getValues () {
        String info = super.getValues();
        return info + "\n" + getLoaded();
    }

    public void setLoaded (boolean isLoaded) {
        this.isLoaded = isLoaded;
    }

    public String getLoaded () {
        if (isLoaded)
            return "Truck is loaded";
        else
            return "Truck is NOT loaded";
    }

    @Override
    public void moveObject() {
        System.out.println("Object is moving");
    }

    @Override
    public void stopObject() {
        System.out.println("Object stopped");
    }


}
