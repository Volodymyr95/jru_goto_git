package ua.javarush.l27;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss zzzz");
        System.out.println(simpleDateFormat.format(date));

        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getTime());
        instance.add(Calendar.DAY_OF_WEEK, 1);
        System.out.println(instance.getTime());
        System.out.println(instance.get(Calendar.DATE));
        System.out.println(instance.getMaximum(Calendar.DAY_OF_WEEK));


    }
}
