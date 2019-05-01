package data;

import lombok.*;

import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
@Value
@Builder
@EqualsAndHashCode(exclude = "beers")
public class Person {


    @Singular
    private List<String> beers;

    @Singular("דג")
    private Set<String> fish;

    @NonNull
    private String name; //
    @NonNull
    private Integer age; //
    private int salary;//


}








