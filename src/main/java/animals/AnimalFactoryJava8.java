package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class AnimalFactoryJava8 {
    private List<Supplier<? extends Animal>> suppliers = new ArrayList<>();
    private Random random = new Random();

    {
        suppliers.add(Cat::new);
        suppliers.add(Dog::new);
        suppliers.add(Horse::new);
    }

    public Animal createRandomAnimal() {
        return suppliers.get(random.nextInt(suppliers.size())).get();
    }





}
