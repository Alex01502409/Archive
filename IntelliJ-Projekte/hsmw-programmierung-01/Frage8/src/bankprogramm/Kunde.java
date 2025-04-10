package bankprogramm;

public class Kunde {

    // TODO: Attribute

    private int id;
    private String name;
    private String vorname;
    private float geldbetrag;

    // TODO: Konstruktor

    public Kunde(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
        this.geldbetrag = 0.0f;
    }

    // TODO: Methode

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public float getGeldbetrag() {
        return geldbetrag;
    }

    public void setGeldbetrag(float geldbetrag) {
        this.geldbetrag = geldbetrag;
    }

    public void addGeldbetrag(float summe) {
        this.geldbetrag += summe;
    }

}
