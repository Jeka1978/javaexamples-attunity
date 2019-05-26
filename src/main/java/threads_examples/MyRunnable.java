package threads_examples;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class MyRunnable implements Runnable {
    @Override
    @SneakyThrows
    public void run() {
        while (true) {
            System.out.println(123);
            Thread.sleep(100);

        }
    }
}
