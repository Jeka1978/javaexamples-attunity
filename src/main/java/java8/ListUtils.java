package java8;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {



    public static <T> int countDuplicates(T t, List<T> list) {
        int counter=0;
        for (T t1 : list) {
            if (t1.equals(t)) {
                counter++;
            }
        }
        return counter;
    }


    public static <T> int countDuplicates(T t, List<T> list, Equaltor<T> equalator) {
        int counter=0;
        for (T t1 : list) {
            if (equalator.equals(t, t1)) {
                counter++;
            }
        }
        return counter;
    }
}











