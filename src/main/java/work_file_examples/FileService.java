package work_file_examples;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Evgeny Borisov
 */
public interface FileService {
    void addTextToFile(File file, String text) ;
}
