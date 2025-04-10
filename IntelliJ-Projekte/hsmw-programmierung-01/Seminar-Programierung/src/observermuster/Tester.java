package observermuster;

public class Tester {

    public static void main(String[] args) {
        Nachrichten nachrichten = new Nachrichten(); // Objekt was beobachtet wird

        Sportkanal sk1 = new Sportkanal(); // Observer

        nachrichten.addObserver(sk1);

        nachrichten.sendeNachricht("Heute");

        System.out.println(sk1);

        Studentenkanal studis = new Studentenkanal();

        nachrichten.addObserver(studis);

        nachrichten.sendeNachricht("gleich kommt MVC");

        System.out.println(sk1);
        System.out.println(studis);
    }
}
