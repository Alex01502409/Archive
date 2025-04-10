package application.demo;

import java.util.Date;
import java.util.TimerTask;

public class Aufgabe extends TimerTask {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - " + new Date());
    }
}
