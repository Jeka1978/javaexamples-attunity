package how_pass_params;

import java.time.LocalDateTime;

/**
 * @author Evgeny Borisov
 */
public class StringUtil {




    public static String makeStringUpperCase(String str) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime tommorow = now.plusDays(1);

        LocalDateTime jeka = now.withYear(1978);

        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String s = "java";
        s = makeStringUpperCase(s);
    }
}
