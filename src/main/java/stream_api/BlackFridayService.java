package stream_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * @author Evgeny Borisov
 */
public class BlackFridayService {

    public static Map<Integer, Long> getMap(int start, int end) {
        LocalDate startDate = LocalDate.of(start, 1, 13);
        LocalDate endDate = LocalDate.of(end, 12, 13);
        return Stream.iterate(startDate, localDate -> localDate.plusMonths(1))
                .limit(ChronoUnit.MONTHS.between(startDate, endDate))
                .filter(localDate -> localDate.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(groupingBy(LocalDate::getYear, counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .peek(System.out::println)
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (aLong, aLong2) -> aLong, LinkedHashMap::new));
    }


    public static void main(String[] args) {
        getMap(2000,2050);
    }

















}
