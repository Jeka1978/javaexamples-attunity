package java8;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface Equaltor<T> {
    boolean equals(T t1, T t2);

}
