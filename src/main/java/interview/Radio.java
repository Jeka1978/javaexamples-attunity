package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface Radio {
    void changeChannel();
}



class Stam{
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "scala", "groovy", "c#", "python");
        Collections.sort(list, (o1, o2) -> o1.length()-o2.length());
        System.out.println(list);

    }



}

