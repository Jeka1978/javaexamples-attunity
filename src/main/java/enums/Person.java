package enums;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
public class Person {
    private String name;
    private MaritalStatus status;


    public static void main(String[] args) {

        int dbCode =3;
        MaritalStatus maritalStatus = MaritalStatus.findByDbCode(3);
        String hebrewDesc = maritalStatus.getHebrewDesc();
        System.out.println("hebrewDesc = " + hebrewDesc);
    }
}
