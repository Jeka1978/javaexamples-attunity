package stream_api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class WordUtilsTest {

    private File file;

    @Before
    public void setUp() throws Exception {
        file = new File("song.txt");
    }

    @Test
    public void countWords() {

        long amount = WordUtils.countWords(file);
        Assert.assertEquals(7,amount);
    }

    @Test
    public void avgWordLength() {
        double avg = WordUtils.avgWordLength(file);
        Assert.assertEquals(4.57,avg,0.01);
    }
}