package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPredicate {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Pug", "Chihuahua", "Beagle", "Terrier", "Golden");
		
		Predicate<String> longerThanSix = s -> s.length() > 6;
		
		words.stream().filter(longerThanSix).forEach(System.out::println);
	}

}
