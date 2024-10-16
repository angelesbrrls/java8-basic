package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaSort {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("A","B", "C");
		
		names.sort((String a, String b) -> a.compareTo(b));
		names.forEach(System.out::println);
		
	}

}
