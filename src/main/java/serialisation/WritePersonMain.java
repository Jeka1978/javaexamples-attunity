package serialisation;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Evgeny Borisov
 */
public class WritePersonMain {
    @SneakyThrows
    public static void main(String[] args) {
        Person moshe = new Person("Moshe", 120);
        File file = new File("c:\\tmp\\person.obj");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();


        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(moshe);


    }
}
