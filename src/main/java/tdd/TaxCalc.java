package tdd;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
@NoArgsConstructor
public class TaxCalc {


    @Setter
    private MaamResolver maamResolver;

    protected double afterMaam(double price) {
        if(price<0){
            throw new IllegalStateException("price can't be negative");
        }
        double maam = maamResolver.getMaam();
        return price*maam +price;

    }
}
