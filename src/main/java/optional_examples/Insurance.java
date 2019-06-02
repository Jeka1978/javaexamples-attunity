package optional_examples;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
@Getter
public enum Insurance {
    IDI("ביטוח ישיר"),
    MIGDAL("מיגדל");
    private String name;

}
