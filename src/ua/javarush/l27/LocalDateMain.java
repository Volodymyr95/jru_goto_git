package ua.javarush.l27;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2020, 12, 12);
        System.out.println(now.plusDays(11));
        System.out.println(now.format(DateTimeFormatter.ofPattern("dd-MM-YY")));
        System.out.println(now.minusDays(2));
        System.out.println(now.minus(1, ChronoUnit.YEARS));
        System.out.println(now.minusYears(1));

    }
}
