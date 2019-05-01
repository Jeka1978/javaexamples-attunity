package gc;

/**
 * @author Evgeny Borisov
 */
public class StupidService {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("I'm dead");
    }
}
