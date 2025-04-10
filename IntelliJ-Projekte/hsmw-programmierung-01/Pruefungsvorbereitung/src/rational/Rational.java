package rational;

public class Rational {
    // TODO: Attribute
    private int zeahler; // чисельник (зверху)
    private int nenner; // знаменник (знизу)

    // TODO: Konstruktor
    public Rational(int z, int n) {
        this.zeahler = z;
        this.nenner = n;
    }

    public Rational() {}

    // TODO: Methode
    public int getZeahler() {
        return zeahler;
    }

    public int getNenner() {
        return nenner;
    }

    @Override
    public String toString() {
        return zeahler + "/" + nenner + " (" + "Zähler = " + zeahler + ", Nenner = " + nenner + ") ";
    }

    public boolean equals(Rational r) {
        return (this.zeahler == r.getZeahler() && this.nenner == r.getNenner());
    }

    public double doubleValue() {
        return (double) this.zeahler / (double) this.nenner;
    }

    public Rational plus(Rational r) {
        return new Rational(this.zeahler * r.nenner + this.nenner * r.zeahler, this.nenner * r.nenner);
    }

    public Rational minus(Rational r) {
        return new Rational(this.zeahler * r.nenner - this.nenner * r.zeahler, this.nenner * r.nenner);
    }

    public Rational mal(Rational r) {
        return new Rational(this.zeahler * r.zeahler, this.nenner * r.nenner);
    }

    public Rational durch(Rational r) {
        return new Rational(this.zeahler * r.nenner, this.nenner * r.zeahler);
    }

}
