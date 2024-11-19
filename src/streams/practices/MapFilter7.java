package streams.practices;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import streams.practices.models.Empleado;



/*
 * Filtrar empleados cuya edad sea mayor o igual a 30.
 * Calcular el promedio de salario de los empleados filtrados.
 * */
public class MapFilter7 {
	public static void main(String[] args) {
		
		List<Empleado> empleados = Arrays.asList(
			    new Empleado("Juan", 28, 3000),
			    new Empleado("Ana", 35, 4500),
			    new Empleado("Carlos", 40, 6000),
			    new Empleado("Maria", 25, 3500),
			    new Empleado("Luis", 45, 5500)
			);
		
		OptionalDouble  resultado = empleados.stream()
				.filter(e -> e.getEdad() >= 30)
				.mapToDouble(Empleado::getSalario)
				.average();
		
		System.out.println(resultado.orElse(0));
	}
}
