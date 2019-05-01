package animals;


import data.Person;

import java.awt.*;

import static java.lang.Math.*;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public  void main(String[] args) {


        double sin = sin(30);
        System.out.println("sin = " + sin);

        AnimalFactory factory = new AnimalFactory();
        for (int i = 0; i < 5; i++) {

            Animal animal = factory.createRandomAnimal();
            animal.makeVoice();
        }

    }
}
