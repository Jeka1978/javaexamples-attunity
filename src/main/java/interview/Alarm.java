package interview;

import java.time.LocalTime;

/**
 * @author Evgeny Borisov
 */
public interface Alarm {
    void stop();

    void setTime(LocalTime time);
}
