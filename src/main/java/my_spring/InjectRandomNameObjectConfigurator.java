package my_spring;

import com.github.javafaker.Faker;
import com.github.javafaker.GameOfThrones;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomNameObjectConfigurator implements ObjectConfigurator {
    private GameOfThrones gameOfThrones = new Faker().gameOfThrones();

    @Override
    @SneakyThrows
    public void configure(Object t) {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomName.class)) {
                field.setAccessible(true);
                field.set(t,gameOfThrones.character());
            }
        }
    }
}
