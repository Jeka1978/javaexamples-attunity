package interview;

import java.time.LocalTime;

/**
 * @author Evgeny Borisov
 */
public class AlarmImpl implements Alarm {

    private LocalTime myTime = LocalTime.now();


    @Override
    public void stop() {
        System.out.println("stop alarm was called");
    }

    @Override
    public void setTime(LocalTime time) {
        this.myTime = time;
        System.out.println("time was set to "+time);
    }
}
