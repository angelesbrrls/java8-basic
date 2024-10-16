package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaEven {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		
		List<Integer> evenNums = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		evenNums.forEach(System.out::println);
	}

}
