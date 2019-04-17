package animals;

/**
 * @author Evgeny Borisov
 */
public class Duck implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("kwak!!!");
    }
}
