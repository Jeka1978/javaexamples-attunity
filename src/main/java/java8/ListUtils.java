package java8;

import lombok.SneakyThrows;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {

    public static <T> void printSorted(List<T> list, Comparator<T> comparator) {
        list.sort(comparator);
        list.forEach(System.out::println);
    }


    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> action) {

        for (T t : list) {
            action.accept(t);
            Thread.sleep(delay);
        }
    }


    public static <T> int countDuplicates(T t, List<T> list) {
        int counter = 0;
        for (T t1 : list) {
            if (t1.equals(t)) {
                counter++;
            }
        }
        return counter;
    }


    public static <T> int countDuplicates(T t, List<T> list, Equaltor<T> equalator) {
        int counter = 0;
        for (T t1 : list) {
            if (equalator.equals(t, t1)) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        List<Integer> nums = asList(33,4,5,1, 2, 3, 4);
        forEachWithDelay(nums,200, x -> System.out.println(x));

    printSorted(nums,(o1, o2) -> o1-o2);








    }
}











