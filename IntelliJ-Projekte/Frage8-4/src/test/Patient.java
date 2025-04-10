package test;

public class Patient {
    private String name;
    private int betreuungszeit;

    public Patient(String name) {
        this.name = name;
    }

    public void setBetreuungszeit(int betreuungszeit) {
        this.betreuungszeit = betreuungszeit;
    }

    public int getBetreuungszeit() {
        return betreuungszeit;
    }

    @Override
    public String toString() {
        return "Patient " + name + " benötigt " + betreuungszeit + " Betreuungszeit";
    }
}


