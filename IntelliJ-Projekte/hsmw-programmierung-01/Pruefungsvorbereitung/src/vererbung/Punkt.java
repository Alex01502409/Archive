package vererbung;

public class Punkt {
    private double x;
    private double y;

    public  Punkt(){
        this.x = 0;
        this.y = 0;
    }

    public Punkt(double xWert, double yWert) {
        this.x = xWert;
        this.y = yWert;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }

    public void verschiben(double dx, double dy) {
        this.x = x + dx;
        this.y = y + dy;
    }

    public void versetzen(double xNeu, double yNeu) {
        this.x = xNeu;
        this.y = yNeu;
    }

    public boolean equals(Punkt p) {
        boolean ergebnis = this.x == p.getX() && this.y == p.getY();
        return ergebnis;
    }

}
