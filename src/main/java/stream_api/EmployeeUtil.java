package stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtil {

    public static void printAllEmployeesSortedWhichAreUppercase(List<Employee> employees) {
        employees.stream()
                .filter(employee -> employee.getName().equals(employee.getName().toUpperCase()))
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
    }

    public static void printAllNames(List<Employee> employees) {
        Optional<String> optional = employees.stream()
                .map(Employee::getName)
                .reduce((s, s2) -> s + ", " + s2);

        optional.ifPresent(System.out::println);
    }

    public static int totalSalary(List<Employee> employees) {
        Optional<Integer> optional = employees.stream()
                .map(Employee::getSalary)
                .reduce(Integer::sum);

        return optional.orElse(0);
    }

    public static int totalSalary2(List<Employee> employees) {
        return employees.stream().mapToInt(Employee::getSalary).sum();

    }

    public static Map<String, Integer> name2Salary(List<Employee> employees) {

        return employees.stream().collect(
                toMap(Employee::getName, Employee::getSalary, Integer::sum));
    }

    public static void main(String[] args) {
        List<Employee> employees = asList(
                Employee.builder().name("MOSHE").salary(12).build(),
                Employee.builder().name("MOSHE").salary(15).build(),
                Employee.builder().name("Shlomo").salary(15).build(),
                Employee.builder().name("Smadar").salary(16).build()
        );
        Map<Integer, List<Employee>> map = employees.stream()
                .collect(groupingBy(employee -> employee.getSalary()));
        System.out.println(map);


    }
}










