package generic_demo;

import animals.Animal;
import animals.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList();
        animals.add(new Dog());
//        animals.add("aksjhdskaj");

        Animal o = (Animal) animals.get(0);
    }
}
