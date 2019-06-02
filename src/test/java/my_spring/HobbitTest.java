package my_spring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class HobbitTest {

    @Test
    public void testInjectRandomIntIsSupportedByObjectFactory() {
        Hobbit hobbit = ObjectFactory.getInstance().createObject(Hobbit.class);
        System.out.println(hobbit);
        Assert.assertNotEquals(0,hobbit.getPower());
        Assert.assertNotEquals(0,hobbit.getSpeed());
    }
}