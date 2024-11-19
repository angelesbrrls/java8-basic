package streams.practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import streams.practices.models.Producto;

/*
 * Filtrar productos con precio superior a 50.
 * Aplicar un 20% de descuento a los productos filtrados.
 * Crear una lista con los nombres de los productos con precio actualizado.
 * */
public class MapFilter5 {
	public static void main(String[] args) {
		
		List<Producto> productos = Arrays.asList(
			    new Producto("Laptop", 800),
			    new Producto("Teclado", 40),
			    new Producto("Monitor", 200),
			    new Producto("Ratón", 30),
			    new Producto("Cargador", 15)
			);
		
		
		List<String> nombres = productos.stream().filter(p -> p.getPrecio() > 50)
				.map(p ->{
					p.setPrecio( p.getPrecio() - p.getPrecio() * .20);
					return p.getNombre();
				}).collect(Collectors.toList());
		
		System.out.println(nombres);
	}
}

