package zeichenketten;

import java.util.Locale;

public class Zeichenketten {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println(a);

        char b = '\u03a3';
        System.out.println(b);

        String abc = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(abc.charAt(0)); // Indexstart: 0
        // System.out.println(abc.charAt(999));
        // bei einen Index der nicht existiert wird eine
        // StringIndexOutOfBoundsExeption erzeugt

        System.out.println(abc.substring(5));
        // substring(x) -> von x bis Ende des Strings

        System.out.println(abc.substring(8, 25));
        // substring(start, ende) -> von start bis ende - 1

        System.out.println(abc.contains("def"));
        // contains -> ist eine Zeichenkette überhauopt enthalten
        // ACHTUNG: Gross-Kleinschreibung beachten

        System.out.println(abc.indexOf("def"));
        // indexOf liefert das erste Vorkommen vom gesuchten Wert
        System.out.println(abc.indexOf("def", 10));
        // indexOf(Wert, Startindex) findet das erste Vorkommen
        // von Wert ab einen Startindex
        // indexOf liefert -1 falls der gesuchte Wert nicht existiert

        String s = """
                Hallo
                Mittweida
                ein
                kleiner
                Test.
                """; // ab Java 15
        System.out.println(s);

        System.out.println(s.length());

        System.out.println(s.toUpperCase());

        String zk1 = "Hallo ";
        String zk2 = "Mittweida";
        String zk3 = zk1 + zk2;
        // + -> Zeichenketteverknupfung / Stringkonkatination
        System.out.println(zk3);

        System.out.printf(Locale.GERMAN, "%,d %n", 10000);
        System.out.printf(Locale.US, "%,d %n", 10000);

        String f = String.format("%f ist Gleitkomma, %d ist int und %s ist String %n",
                        3.4f, 2024, "Hallo Mittweida");
        System.out.println(f);

        String t = "a";
        long start = System.currentTimeMillis();
        for (int m = 0; m < 1000000; m++) {
            t += "a";
        }
        long ende = System.currentTimeMillis();
        long diff1 = ende - start;
        System.out.println(diff1 + " ms");

        StringBuilder sb = new StringBuilder();
        sb.append("a");
        long start2 = System.currentTimeMillis();
        for (int c = 0; c < 1000000; c++) {
            sb.append("a");
        }
        long ende2 = System.currentTimeMillis();
        long diff2 = ende2 - start2;
        System.out.println(diff2 + " ms");
        // bei der Zeitmessung keine grafischen Ausgaben
        // zwichrn den Messpunkten

    }
}
