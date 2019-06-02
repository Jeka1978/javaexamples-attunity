package stream_api;

import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

/**
 * @author Evgeny Borisov
 */
public class WordUtils {
    @SneakyThrows
    public static long countWords(File file) {

        Stream<String> words = getWordsAsStream(file);
        return words.count();
    }

    private static Stream<String> getWordsAsStream(File file) throws IOException {
        Stream<String> lines = Files.lines(Paths.get(file.toURI()));
        return lines.flatMap(line -> Arrays.stream(line.split("\\W+")));
    }

    @SneakyThrows
    public static double avgWordLength(File file) {
        Stream<String> words = getWordsAsStream(file);
        return words.mapToInt(String::length).average().orElse(0);
    }

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println(getWordsAsStream(new File("yest"))
                .filter(word -> word.length()>1)
                .collect(Collectors.groupingBy(String::toLowerCase, counting()))
                .entrySet()
                .stream()

                .max(Map.Entry.comparingByValue())
                .get());

    }
}










