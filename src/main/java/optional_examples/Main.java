package optional_examples;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person(new Car(Insurance.IDI));
        String name = person.getCar()
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("IDI");

        System.out.println(name);

    }
}
