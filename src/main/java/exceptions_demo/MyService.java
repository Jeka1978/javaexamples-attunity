package exceptions_demo;

/**
 * @author Evgeny Borisov
 */
public class MyService {
    public void doWork() throws Exception {
        System.out.println("working...");
        throw new Exception("fire all people");
    }
}
