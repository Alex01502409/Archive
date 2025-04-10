package praktikumhsmw2;

public class Punkt {
// Damit die Klasse Punkt allgemein benutzbar ist, wird sie als öffentlich vereinbart:

    /** Attribute */

    private double x; // X - Koordinate
    private double y; // Y - Koordinate


    /** Kontruktoren */

    public Punkt (double xWert, double yWert) {
        x = xWert;
        y = yWert;
    }

    public Punkt () {
        x = 0;
        y = 0;
    }


    /** Methoden */

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void versetzen(double xNeu, double yNeu) {
        this.x = xNeu;
        this.y = yNeu;
    }

    public void verschieben (double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public boolean equals(Punkt p) {
        return (x == p.x) && (y == p.y);
    }
}
