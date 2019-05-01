package how_pass_params;

/**
 * @author Evgeny Borisov
 */
public class HumanUtil {
    public static void makeNameUpperCase(Human h) {
        h.setName(h.getName().toUpperCase());
        h = null;
    }


    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Moshe");
        makeNameUpperCase(human);
        System.out.println("human = " + human);
    }
}
