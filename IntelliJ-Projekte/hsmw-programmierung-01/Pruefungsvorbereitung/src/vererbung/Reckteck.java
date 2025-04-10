package vererbung;

public class Reckteck extends GeometrischeForm{
    private double breite;
    private double hoehe;

    public Reckteck() {
        super(new Punkt());
        hoehe = 10;
        breite = 20;
    }

    public Reckteck(Punkt startpunkt, double h, double b) {
        super(startpunkt);
        hoehe = h;
        breite = b;
    }

    public Reckteck(double xstart, double ystart, double h, double b) {
        super(new Punkt(xstart, ystart));
        hoehe = h;
        breite = b;
    }

    public double getHoehe() {
        return hoehe;
    }

    public double getBreite() {
        return breite;
    }

    public double berechenFlaeche() {
        return breite * hoehe;
    }

    public double berechneUmfang() {
        return 2*(breite+hoehe);
    }

    @Override
    public String toString() {
        String erg = "";
        erg = erg +"Startpunkt: " + getStartpunkt() + "\n";//Zugriff auf Elternklasse --> Startpunkt
        erg = erg +"Hoehe: " + hoehe + "\n";
        erg = erg +"Breite: " + breite + "\n";
        return erg;
    }

    public boolean equals(Reckteck r) {
        return getStartpunkt().equals(r.getStartpunkt()) && hoehe == r.hoehe && breite == r.breite;
    }
}

