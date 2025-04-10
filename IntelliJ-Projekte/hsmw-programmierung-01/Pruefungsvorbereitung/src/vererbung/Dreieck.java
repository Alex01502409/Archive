package vererbung;

public class Dreieck extends GeometrischeForm{
    private Punkt b;
    private Punkt c;

    public Dreieck() {
        super(new Punkt());
        b = new Punkt(1, 0);
        c = new Punkt(0, 1);
    }

    public Dreieck(Punkt a, Punkt c, Punkt b) {
        super(a);
        this.c = c;
        this.b = b;
    }

    @Override
    public String toString() {
        String erg = "Dreieck" + "\na: " + getStartpunkt() + "\nb: " + b + "\nc: " + c + "\n";
        return erg;
    }
}
