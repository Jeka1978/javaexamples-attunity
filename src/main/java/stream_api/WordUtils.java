package stream_api;

import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        return lines.flatMap(line -> Arrays.stream(line.split(" "))).peek(System.out::println);
    }

    @SneakyThrows
    public static double avgWordLength(File file) {
        Stream<String> words = getWordsAsStream(file);
        return words.mapToInt(String::length).average().orElse(0);
    }

    public static void main(String[] args) {
    }
}










