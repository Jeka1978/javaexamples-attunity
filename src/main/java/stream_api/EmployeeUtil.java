package stream_api;

import java.util.List;
import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtil {
    public static int totalSalary(List<Employee> employees) {
        Optional<Integer> optional = employees.stream()
                .map(Employee::getSalary)
                .reduce(Integer::sum);

        return optional.orElse(0);
    }
    public static int totalSalary2(List<Employee> employees) {
        return employees.stream().mapToInt(Employee::getSalary).sum();

    }
}










