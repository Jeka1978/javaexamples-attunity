package animals;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal {


    public void makeVoice() {
        System.out.println("Bark bark");
    }

    public void bringStick() {
        System.out.println("This is your stick, take it");
    }
}
