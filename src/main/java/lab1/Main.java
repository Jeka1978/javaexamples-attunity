package lab1;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        double[] doubles = {2.5, 3.3, 3};
        int[] ints = new int[doubles.length];

        for (int i = 0; i < doubles.length; i++) {
            ints[i] = (int) doubles[i];
        }

        Arrays.stream(ints).forEach(System.out::println);

    }
}
