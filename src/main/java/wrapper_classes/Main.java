package wrapper_classes;

import data.Person;
import how_pass_params.Human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {

    static {

    }
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(new Human());
        list.add(LocalDate.now());
        list.add(Integer.valueOf(12));
        System.out.println(list);

        Integer x = Integer.valueOf(12);
        Integer y = 12;
        Integer z = new Integer(12);

        Integer a = 1;
        Integer b = 1;
        System.out.println(a+b);

    }
}
