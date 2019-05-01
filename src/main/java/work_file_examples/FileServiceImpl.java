package work_file_examples;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author Evgeny Borisov
 */
public class FileServiceImpl implements FileService {



    @Override
    @SneakyThrows
    public void addTextToFile(File file, String text)  {
        if (file.exists()) {
            try {
                FileOutputStream fos = new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                throw e;
                //it will never happen
            }
//            fos.write();
        }
    }
}
