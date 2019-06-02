package optional_examples;

import lombok.AllArgsConstructor;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public class Car {
    private Insurance insurance;

    public Optional<Insurance> getInsurance() {
        return Optional.ofNullable(insurance);
    }
}
