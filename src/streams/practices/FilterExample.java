package streams.practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * La operación filter se utiliza para filtrar los elementos de un Stream según una condición.
 * Solo los elementos que cumplen con la condición pasarán al siguiente paso del Stream.*/
public class FilterExample {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> resultado = numeros.stream()
		                                 .filter(n -> n > 3)
		                                 .collect(Collectors.toList());
		System.out.println(resultado);
	}
}
