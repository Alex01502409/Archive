public class Berechnung {

        public String berechne(long e) {
            e = Math.abs(e);
            long anz = 0;

            while (e > 0) {
                e = e / 2;
                anz++;
            }

            if (anz == 0) {
                return "kein Durchlauf aus";
            } else {
                return String.valueOf(anz);
            }
        }

        public static void main(String[] args) {
            Berechnung obj = new Berechnung();

            // Test 1
            System.out.println(obj.berechne(0));
            // Test 2
            System.out.println(obj.berechne(8));
            // Test 3
            System.out.println(obj.berechne(-16));
        }
    }


