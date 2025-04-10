package praktikumhsmw2;

public class Rechteck {

    /** Attriebute */

    private Punkt startpunkt;
    private double hoehe;
    private double breite;


    /** Konstruktoren */

    public Rechteck(Punkt startpunkt, double h, double b) {
        this.startpunkt = startpunkt;
        this.hoehe = h;
        this.breite = b;
    }

    public Rechteck (double xstart, double ystart, double h, double b) {
        this.startpunkt = new Punkt(xstart, ystart);
        this.hoehe = h;
        this.breite = b;
    }

    public Rechteck () {
        startpunkt = new Punkt(0,0);
        hoehe = 1;
        breite = 1;
    }


    /** Methoden */

    // Zugriffsmethoden
    public Punkt getStartpunkt(){
        return startpunkt;
    }

    public double getHoehe() {
        return hoehe;
    }

    public double getBreite() {
        return breite;
    }


    // Methoden zur Berechnung von Fläche und Umfang
    public double berechneFlaeche() {
        return hoehe * breite;
    }

    public double berechneUmfang() {
        return 2 * (hoehe + breite);
    }


    // Bewegungsmethoden:
    public void versetzen(double xNeu, double yNeu) {
        this.startpunkt.versetzen(xNeu, yNeu);
    }

    public void verschieben(double dx, double dy) {
        this.startpunkt.verschieben(dx, dy);
    }


    // toString()-Methode zum Anzeigen von Informationen über das Rechteck
    public String toString () {
        return "\nStartpunkt des Rechtecks: " + getStartpunkt() + "\nHöhe des Rechtecks: " + getHoehe() + "\nBreite des Rechtecks: " + getBreite() + "\nFläche des Rechtecks: " + berechneFlaeche() + "\nUmfang des Rechtecks: " + berechneUmfang();
    }

    // equals
    public boolean equals(Rechteck r) {
        return this.startpunkt.equals(r.startpunkt) && this.breite == r.breite && this.hoehe == r.hoehe;
    }

}
