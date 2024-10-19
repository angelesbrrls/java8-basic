package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        
        List<String> words = Arrays.asList("Java", "Streams", "API", "Lambda");
        Stream<String> stream = words.stream();

        stream.forEach(System.out::println);
    }
}