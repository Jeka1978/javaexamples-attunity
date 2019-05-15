package reflections_example;

import java.util.Date;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();
        testRunner.runAllTestMethods("reflections_example.TestObject");
        Date date = new Date(1,2,3);
    }
}
