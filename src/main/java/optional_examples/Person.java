package optional_examples;

import lombok.AllArgsConstructor;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public class Person {
   private Car car;

   public Optional<Car> getCar() {
      return Optional.ofNullable(car);
   }
}
