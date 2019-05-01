package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Getter
public enum MaritalStatus {

    SINGLE(1,"רווק"),
    MARRIED(2,"נשוי"),
    DIVORCED(3,"גרוש");

    private final int dbCode;
    private final String hebrewDesc;


    public static MaritalStatus findByDbCode(int dbCode) {
        MaritalStatus[] statuses = values();
        for (MaritalStatus status : statuses) {
            if (status.dbCode == dbCode) {
                return status;
            }
        }
        throw new UnsupportedOperationException(dbCode+ "not supported");
    }

}
