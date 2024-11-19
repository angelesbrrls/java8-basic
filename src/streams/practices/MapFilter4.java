package streams.practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Filtrar empleados con salario superior a 4000.
 * Aumentar su salario en un 10%.
 * Mostrar los nombres.
 * */
public class MapFilter4 {
	public static void main(String[] args) {
		List<Empleado> empleados = Arrays.asList(
			    new Empleado("Juan", 28, 3000),
			    new Empleado("Ana", 35, 4500),
			    new Empleado("Carlos", 40, 6000),
			    new Empleado("Maria", 25, 3500),
			    new Empleado("Luis", 45, 5500)
			);
		
		List<String> resultado = empleados.stream().filter(e -> e.getSalario() > 4000)
				.map( e -> {
					e.setSalario(e.getSalario() * 1.10);
					return e.getNombre();
				}).collect(Collectors.toList());
		
		System.out.println(resultado.toString());
		
	}
}
