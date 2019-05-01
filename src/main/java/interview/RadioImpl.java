package interview;

/**
 * @author Evgeny Borisov
 */
public class RadioImpl implements Radio {
    @Override
    public void changeChannel() {
        System.out.println("chanel was changed");
    }
}
