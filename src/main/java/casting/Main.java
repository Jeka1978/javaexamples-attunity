package casting;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        print(12);
    }


    private static void print(int i) {
        System.out.println("one");
    }
    private static void print(int... ints) {
        System.out.println("many or zero");
    }
}
