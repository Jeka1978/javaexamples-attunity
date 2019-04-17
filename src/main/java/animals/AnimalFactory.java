package animals;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class AnimalFactory {
    private Random random = new Random();

    private Reflections scanner = new Reflections("animals");

    private List<Class<? extends Animal>> animalClasses;

    public AnimalFactory() {
        Set<Class<? extends Animal>> set = scanner.getSubTypesOf(Animal.class);
        animalClasses = new ArrayList<>(set);
    }

    @SneakyThrows
    public Animal createRandomAnimal()  {
        int i = random.nextInt(animalClasses.size());
        Class<? extends Animal> animalClass = animalClasses.get(i);
        Animal animal = animalClass.newInstance();
        return animal;
    }
}
