package streams.practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Filtrar los números impares.
 * Calcular su cuadrado.
 * Crear una lista con los resultados.
 * */
public class MapFilter6 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		List<Double> cuadrados = numeros.stream()
				.filter(n -> n % 2 != 0)
				.map(n -> Math.pow(n, 2)).collect(Collectors.toList());
		
		cuadrados.forEach(System.out::println);
	}
}
