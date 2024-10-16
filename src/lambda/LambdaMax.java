package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaMax {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3, 9, 5, 1, 7, 12, 6);
		
		int max = numbers.stream().max((a,b)-> a.compareTo(b)).get();
		
		System.out.println("Max: " + max);
		
	}

}
