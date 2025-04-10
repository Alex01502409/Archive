package vererbung;

public class Kreis extends GeometrischeForm{
    private int radius;

    public Kreis(Punkt mittelpunkt, int radius) {
        super(mittelpunkt);
        this.radius = radius;
    }

    @Override
    public String toString() {
        String erg = "Kreis:\n";
        erg = erg +"Mittelpunkt: "+getStartpunkt()+"\n";//Zugriff auf Elternklasse --> Startpunkt
        erg = erg +"Radius: "+radius+"\n";
        return erg;
    }
}
