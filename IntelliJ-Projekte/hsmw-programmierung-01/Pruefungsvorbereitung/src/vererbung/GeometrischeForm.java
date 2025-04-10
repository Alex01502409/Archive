package vererbung;

public class GeometrischeForm {
    private Punkt startpunkt;

    public GeometrischeForm() {
        startpunkt = new Punkt();
    }

    public GeometrischeForm(Punkt startpunkt) {
        this.startpunkt = startpunkt;
    }

    public void versetzen(double xNeu, double yNeu) {
        startpunkt.versetzen(xNeu, yNeu);
    }

    public void verschiben(double dx, double dy) {
        startpunkt.verschiben(dx, dy);
    }

    public Punkt getStartpunkt() {
        return startpunkt;
    }
}
