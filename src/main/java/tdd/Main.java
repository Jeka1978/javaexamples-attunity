package tdd;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        TaxCalc taxCalc = new TaxCalc(new IsraelMaamResolver());
        double afterMaam = taxCalc.afterMaam(100);
        System.out.println("afterMaam = " + afterMaam);
    }
}
