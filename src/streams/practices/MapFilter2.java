package streams.practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * De una lista de números enteros:
 * Filtra los números que sean mayores a 10.
 * Aplica un map para restarles 5 a los números filtrados.
 * Obtén el resultado como una lista.
*/
public class MapFilter2 {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(23, 35, 43, 11, 33, 22, 7, 9 ,5, 34);
		
		List<Integer> resultado = numeros.stream().filter(n -> n > 10).map(n -> n -5).collect(Collectors.toList());
		
		resultado.forEach(System.out::println);
	}

}
