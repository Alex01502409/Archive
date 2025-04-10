package observermuster;

public class Studentenkanal implements Kanal{

    private String name;

    public void update(String name) {
        this.name = name;
    }

    public String toString() {
        return "Studentenkanal sendet: " + name;
    }

}
