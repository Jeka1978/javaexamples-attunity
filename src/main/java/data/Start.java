package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Start {
    public static void main(String[] args) {




        List<String> names = new ArrayList<>();
        names.add("Stallone");
        names.add("Brus");
        names.add("Chuch Norris");
        names.add("Arnold");


      names.forEach(x -> System.out.println(x));


        System.out.println("names = " + names);






    }
}
