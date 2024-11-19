package streams.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* Filtra los empleados que tienen más de 30 años, 
 * luego aumenta su salario en un 20% 
 * y finalmente crea una lista de nombres de esos empleados.*/
public class MapFilter1 {

	public static void main(String[] args) {
		
		List<Empleado> empleados = new ArrayList<>();
		Empleado empleado1 = new Empleado("Selegna", 20, 50000);
		Empleado empleado2 = new Empleado("Cleopatra", 40, 28000);
		Empleado empleado3 = new Empleado("Leticia", 35, 40000);
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		
		List<String> empls = empleados.stream()
				.filter( e -> e.getEdad() > 30)
				.map(e -> {
					e.setSalario(e.getSalario() * 1.20);
					return e.getNombre();
				}).collect(Collectors.toList());
		
		List<Double> salarios = empleados.stream()
				.filter( e -> e.getEdad() > 30)
				.map(e -> e.getSalario() * 1.20).collect(Collectors.toList());
		
		System.out.println(empls);
		System.out.println(salarios);
		
		empls.forEach(System.out::println);
		salarios.forEach(System.out::println);

	}

}

class Empleado{

	String nombre;
	int edad;
	double salario;
	
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}


