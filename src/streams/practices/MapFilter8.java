package streams.practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Filtrar las cadenas que tengan menos de 4 caracteres.
 * Revertir las cadenas filtradas.
 * Obtener una lista con las cadenas revertidas.
 * */
public class MapFilter8 {
	public static void main(String[] args) {
		List<String> palabras = Arrays.asList("perro", "gato", "ratón", "luz", "sol");
		
		List<String> resultado = palabras.stream()
                .filter(p -> p.length() < 4)   
                .map(p -> new StringBuilder(p).reverse().toString())  
                .collect(Collectors.toList());

		System.out.println(resultado); 
	}

}
