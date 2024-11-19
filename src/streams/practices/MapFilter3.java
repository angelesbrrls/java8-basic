package streams.practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Filtrar nombres con más de 5 caracteres.
 * Convertir esos nombres a mayúsculas.
 * */
public class MapFilter3 {

	public static void main(String[] args) {
		
		List<String> nombres = Arrays.asList("Juan", "María", "Carlos", "Luis", "Elena");

		List<String> resultado = nombres.stream()
				.filter(n -> n.length() > 5 )
				.map(n -> n.toUpperCase()).
				collect(Collectors.toList());
		resultado.forEach(System.out::println);
	}

}
