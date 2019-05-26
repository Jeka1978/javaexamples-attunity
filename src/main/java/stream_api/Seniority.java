package stream_api;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
@Getter
public enum Seniority {
    JUNIOR(0,10),
    MIDDLE(11,20),
    SENIOR(20,Integer.MAX_VALUE);

    private int min;
    private int max;

    public static Seniority getSeniority(Employee employee) {
       return Arrays.stream(values())
                .filter(seniority -> seniority.min < employee.getSalary() &&
                        seniority.max > employee.getSalary())
                .findAny().get();


    }



}










