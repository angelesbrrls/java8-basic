package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaAdd {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int sum = numbers.stream().reduce(0, (a,b) -> a + b);
		
		System.out.println("Suma total: " + sum);
	}

}
