package tdd;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class IsraelMaamResolver implements MaamResolver {
    private double maam;

    @SneakyThrows
    public IsraelMaamResolver() {
        Thread.sleep(1000);
        maam = 0.18;
    }



    @Override
    public double getMaam() {
        return maam;
    }
}
