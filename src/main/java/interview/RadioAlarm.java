package interview;

import lombok.experimental.Delegate;

import java.time.LocalTime;

/**
 * @author Evgeny Borisov
 */
public class RadioAlarm implements Radio, Alarm{

    @Delegate(excludes = AlarmExclusions.class)
    private Alarm alarm = new AlarmImpl();
    @Delegate
    private Radio radio = new RadioImpl();

    public void stop(){
        System.out.println("Stopped");
    }





}
