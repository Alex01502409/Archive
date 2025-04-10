package Aufzaehlung;

public enum Buchstaben {

    A("a"), B("b"), C("c");

    private final String wert;

    private Buchstaben(String wert) {
        this.wert = wert;
    }

    public String toString() {
        return wert;
    }
}

