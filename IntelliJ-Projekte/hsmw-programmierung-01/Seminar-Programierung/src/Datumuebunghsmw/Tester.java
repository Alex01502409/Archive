package Datumuebunghsmw;
import java.util.Scanner;
import java.sql.SQLOutput;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Datum d1 = new Datum(24, 9, 2004);
//        Datum d2 = new Datum(1, 7, 2005);

        // Es ist Datum - 1
        System.out.println("Festes Datum: " + d1);

        if (d1.istDatumGueltig()) {
            System.out.println("Datum ist gültig");
        } else {
            System.out.println("Datum ist UNgültig");
        }

        // Datum - 2
        System.out.println("Datum 2 - Tag: ");
        int t = scan.nextInt();
        System.out.println("Datum 2 - Monat: ");
        int m = scan.nextInt();
        System.out.println("Datum 2 - Jahr: ");
        int j = scan.nextInt();
        Datum d2 = new Datum(t, m, j);

        System.out.println("Eingegeben würde: " + d2);

        if (d2.istDatumGueltig()) {
            System.out.println("Datum ist gültig");
            if (d2.vor(d1)) {
                System.out.println(d2 + " liegt vor " + d1);
            }else {
                System.out.println(d2 + " liegt NICHT vor " + d1);
            }

        } else {
            System.out.println("Datum ist UNgültig");
        }

    }
}
