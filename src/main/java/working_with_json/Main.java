package working_with_json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Student student = Student.builder().age(18).name("Ilan").build();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(student);
        System.out.println("json = " + json);
        Student student1 = mapper.readValue(json, Student.class);
        System.out.println("student1 = " + student1);
    }
}
