package my_spring;

import lombok.Data;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Data
public class Hobbit {
    @InjectRandomInt(min=3,max=8)
    private int power;
    @InjectRandomInt(min=3,max=8)
    private int speed;

    @InjectRandomName
    private String name;




}
