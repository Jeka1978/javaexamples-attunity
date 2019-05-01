package immutable_objects;

import lombok.Value;
import lombok.experimental.Wither;

/**
 * @author Evgeny Borisov
 */
@Value
@Wither
public class Soldier {
    private String name;
    private int salary;


    public static void main(String[] args) {
        Soldier soldier = new Soldier("John Snow",3000000);
        Soldier soldier1 = soldier.withSalary(50);

    }
}
