package struktogramm;

public class GGT {
    public static int berechneGGT(int a, int b) {

        if ( a < b ){
            int temp = a;
            a = b;
            b = temp;
        }

        int r = a % b;

        while ( r > 0 ) {
            a = b;
            b = r;
            r = a % b;
        }

        return b;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 21;
        int ggt = berechneGGT(a, b);
        System.out.println("Der größte gemeinsame Teiler von " + a + " und " + b + " ist: " + ggt);
    }

}
