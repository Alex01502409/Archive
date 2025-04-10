package test;

import java.util.ArrayList;
import java.util.Random;

public class Pflegekraft {

        private ArrayList<Patient> patienten = new ArrayList<>();
        private Random random = new Random();

        public Pflegekraft(String[] namenPatienten) {

            for (String name : namenPatienten) {

                Patient patient = new Patient(name);

                int betreuungszeit = 10 + random.nextInt(6);

                patient.setBetreuungszeit(betreuungszeit);
                patienten.add(patient);
            }

        }

        public void pflege() {

            for (Patient patient : patienten) {
                System.out.println(patient.toString());

                try {
                    Thread.sleep(patient.getBetreuungszeit() * 1000L);
                } catch (InterruptedException e) {
                    System.out.println("Fehler");
                }

            }
        }

        public static void main(String[] args) {

            String[] patientenNamen = {"Dima", "Sasha", "Maxim", "Yegor"};

            Pflegekraft pflegekraft = new Pflegekraft(patientenNamen);
            pflegekraft.pflege();

        }

}
