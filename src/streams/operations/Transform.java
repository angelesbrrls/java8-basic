package streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Lista de palabras, transforma cada palabra a su longitud.
public class Transform {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Hello","Streams","in", "Java 8");
		
		List<Integer> countWords = words.stream().map(String::length).collect(Collectors.toList());
		
		countWords.forEach(System.out::println);

	}

}
