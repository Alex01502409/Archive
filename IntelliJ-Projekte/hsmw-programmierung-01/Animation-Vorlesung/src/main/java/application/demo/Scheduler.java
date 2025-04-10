package application.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class Scheduler {

    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();

        Aufgabe a1 = new Aufgabe();

        // timer.schedule(a1, 10000); // 10.000ms = 10s

        // timer.schedule(a1, 0, 3000);

        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        Date start = f.parse("22.01.2025 17:41:00");
        timer.schedule(a1, start);
    }
}
