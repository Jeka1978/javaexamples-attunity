package exceptions_demo;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class UserServiceImpl implements UserService {
    @Override
    @SneakyThrows
    public void handle() {
        MyService myService = new MyService();
        myService.doWork();

    }
}
