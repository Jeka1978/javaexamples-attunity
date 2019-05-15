package tdd;

import org.junit.*;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TaxCalcTest {

    private MaamResolver mock;
    private TaxCalc taxCalc;

    @BeforeClass
    public static void initOnce() {
        System.out.println(123);
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("before test");
        mock = Mockito.mock(MaamResolver.class);
        Mockito.when(mock.getMaam()).thenReturn(0.1);
        taxCalc = new TaxCalc(mock);
    }

    @Test(expected = IllegalStateException.class)
    public void testNegativePriceWillThrowException() {
        taxCalc.afterMaam(-10);
    }

    @Test
    public void testAfterMaamIsWorkingCorrectly() {
        double afterMaam = taxCalc.afterMaam(100);
        Assert.assertEquals(110,afterMaam,0.00001);
    }


    @After
    public void tearDown() throws Exception {
        System.out.println("end of test");
    }
}










