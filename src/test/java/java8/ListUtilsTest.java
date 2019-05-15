package java8;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class ListUtilsTest {

    @Test
    public void countDuplicates() {
        List<Integer> integers = asList(1, 2, 3);
        int duplicates = ListUtils.countDuplicates(1, integers);
        Assert.assertEquals(1, duplicates);
    }

    @Test
    public void countDuplicates2() {
        List<String> strings = asList("java", "Java", "JAVA", "scala");
        int duplicates = ListUtils.countDuplicates("java", strings, (t1, t2) -> t1.equalsIgnoreCase(t2));
        Assert.assertEquals(3, duplicates);
    }
}








