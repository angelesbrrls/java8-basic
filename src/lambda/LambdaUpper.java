package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaUpper {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Java","Python","SQL", "JavaScript");
		
		List<String> upperCaseWords = words.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		upperCaseWords.forEach(System.out::println);

	}

}
