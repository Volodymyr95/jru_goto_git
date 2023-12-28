package ua.javarush.l27;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getMonth());
        System.out.println(now.getHour());
        LocalDate localDate = now.toLocalDate();
        System.out.println(localDate);
        Instant now1 = Instant.now();
        System.out.println(now1.getEpochSecond());

        ZoneId of = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokioTime = ZonedDateTime.now(of);
        System.out.println(tokioTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate date = LocalDate.parse("02-23-2019", dtf);
        System.out.println(date);

    }
}
