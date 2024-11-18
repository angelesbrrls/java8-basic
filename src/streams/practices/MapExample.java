package streams.practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> resultado = numeros.stream()
		                                 .map(n -> n * 2)
		                                 .collect(Collectors.toList());
		System.out.println(resultado);  

	}
}
