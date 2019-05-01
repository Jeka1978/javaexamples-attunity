package gc;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        StupidService stupidService = new StupidService();
        stupidService=null;
        System.out.println(214);
        System.gc();
    }
}
