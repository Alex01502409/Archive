package bankprogramm;

import java.util.ArrayList;

public class Bank {

    // TODO: Attribute
    private ArrayList<Kunde> kunden;
    private String iban;
    private String name;

    // TODO: Konstruktor
    public Bank (String name, String iban) {
        this.name = name;
        this.iban = iban;
        this.kunden = new ArrayList<>();
    }

    // TODO: Methode
    public int addKunde(String name, String vorname) {
        Kunde neuerKunde = new Kunde(name, vorname);
        int id = kunden.size() + 1;
        neuerKunde.setId(id);
        kunden.add(neuerKunde);
        return id;
    }

    public Kunde editKunde(int id) {
        for (Kunde k : kunden) {
            if (k.getId() == id) {
                return k;
            }
        }
        return null;
    }

    public void gibKundeAus() {
        System.out.println("Bank name: " + name);
        System.out.println("IBAN: " + iban);
        System.out.println("Kunden Liste:");
        for (Kunde k : kunden) {
            String geldbetragFormatted = String.format("%,.2f €", k.getGeldbetrag());
            System.out.println("ID: " + k.getId() + ", Name: " + k.getName() + ", Vorname: " + k.getVorname() + ", Geldbetrag: " + geldbetragFormatted);
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank("Grundlagen der Informatik Bank", "IF24wS1-B");

        // Kunde hinzufügen
        bank.addKunde("Alexander", "Pavlovich");
        bank.addKunde("Misha", "Kemkin");
        bank.addKunde("Oleksandr", "Polishchuk");



        // Geld überweisen
        bank.editKunde(1).addGeldbetrag(100.0f);
        bank.editKunde(2).addGeldbetrag(100.0f);
        bank.editKunde(3).addGeldbetrag(2500.0f);

        bank.editKunde(3).addGeldbetrag(-394.32f);
        bank.editKunde(1).addGeldbetrag(-150f);

        bank.gibKundeAus();

    }

}
