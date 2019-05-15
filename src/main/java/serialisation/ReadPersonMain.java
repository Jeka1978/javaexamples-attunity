package serialisation;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Evgeny Borisov
 */
public class ReadPersonMain {
    @SneakyThrows
    public static void main(String[] args) {

        File file = new File("c:\\tmp\\person.obj");

        FileInputStream fos = new FileInputStream(file);
        ObjectInputStream oos = new ObjectInputStream(fos);
        Person o = (Person) oos.readObject();
        System.out.println(o.getAge());
        System.out.println(o.getName());


    }
}
