package Datumuebunghsmw;

public class Datum {
    /**
     * Attribute
     */
    private int tag;
    private int monat;
    private int jahr;

    /**
     * Kontruktoren
     */
    public Datum(int tag, int monat, int jahr) {

        if (Datum.istDatumGueltig(tag, monat, jahr)) {

            this.tag = tag;
            this.monat = monat;
            this.jahr = jahr;

        } else {

            this.tag = 0;
            this.monat = 0;
            this.jahr = 0;

        }
    }

    /**
     * Methoden
     */
    public int getTag() {
        return tag;
    }

    public int getMonat() {
        return monat;
    }

    public int getJahr() {
        return jahr;
    }

    public String toString() {
        String datString = "";
        if (tag < 10) {
            datString = "0";
        }
        datString = datString + tag + ".";


        if (monat < 10) {
            datString = datString + "0";
        }
        datString = datString + monat + "." + jahr;

        return datString;
    }

    public boolean equals(Datum d) {
        return (tag == d.tag) && (monat == d.monat) && (jahr == d.jahr);
    }

    public static boolean vor(Datum d1, Datum d2) {
        return (d1.jahr < d2.jahr) ||
                (d1.jahr == d2.jahr) && (d1.monat < d2.monat) ||
                (d1.jahr == d2.jahr) && (d1.monat == d2.monat) && (d1.tag < d2.tag);
    }

    public boolean vor(Datum d) {
        return Datum.vor(this, d);
    }

    public static boolean istDatumGueltig(int tag, int monat, int jahr) {
        return (1 <= monat) && (monat <= 12) && (1 <= tag) && (tag <= anzahlTageImMonat(monat, jahr));

    }

    public boolean istDatumGueltig () {
        return Datum.istDatumGueltig(this.tag, this.monat, this.jahr);
    }

    private static boolean istSchaltjahr(int jahr) {
        boolean sj;

        if (jahr % 100 == 0) {
            sj = (jahr % 400 == 0);
        } else {
            sj = (jahr % 4 == 0);
        }

        return sj;

    }


    private static int anzahlTageImMonat(int monat, int jahr) {
        int anz = 0;
        if ((monat == 1) || (monat == 3) || (monat == 5) || (monat == 7) || (monat == 8) || (monat == 10) || (monat == 12)) {
            anz = 31;
        } else if ((monat == 4) || (monat == 6) || (monat == 9) || (monat == 11)) {
            anz = 30;
        } else if ((monat == 2)) {
            if (istSchaltjahr(jahr)) {
                anz = 29;
            } else {
                anz = 28;
            }
        } else {
            anz = 0;
        }
        return anz;
    }
}


