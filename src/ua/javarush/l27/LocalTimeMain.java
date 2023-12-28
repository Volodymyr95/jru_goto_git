package ua.javarush.l27;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime of = LocalTime.of(2, 12, 33);
        System.out.println(of);
        System.out.println(of.getHour());
        System.out.println(of.getMinute());
        System.out.println(of.getSecond());
        System.out.println(of.getNano());

        LocalTime time = of.plusHours(12);
        System.out.println(time);
        LocalTime time1 = of.plus(1, ChronoUnit.MINUTES);
        System.out.println(time1);
    }
}
