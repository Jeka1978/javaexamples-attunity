package date_time;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();
        LocalDate jeka = LocalDate.of(1978, 3, 10);
        LocalDate roman = LocalDate.of(1983, 8, 9);
        LocalDateTime yest = now.minusDays(1).minusHours(1);
        LocalDateTime otherDate = yest.withYear(1900).withMonth(10);
        long between = ChronoUnit.YEARS.between(jeka, roman);
        System.out.println(jeka);
        System.out.println(roman);
        System.out.println(now);
        System.out.println("between = " + between);
        System.out.println(yest.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRANCE));
        System.out.println(yest.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        System.out.println(yest.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPAN));
        System.out.println(yest.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.JAPAN));





        OffsetDateTime utc = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println("utc date = " + utc);


    }
}
