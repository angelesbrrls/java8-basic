package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(new Person("Luke", 25),
											new Person("Brandon", 26),
											new Person("Steve", 27),
											new Person("David", 25));
		// Personas mayores de 25 años
		List<Person> mayores25 = people.stream().filter(person -> person.getAge() > 25).collect(Collectors.toList());
		
		// Nombres de las personas	
		List<String> nombres25 = mayores25.stream().map(Person::getName).collect(Collectors.toList());
		
		// Contar mayores25
		long total = mayores25.stream().count();
		
		mayores25.forEach(System.out::println);
		System.out.println(mayores25);
		System.out.println("-------------------");
		nombres25.forEach(System.out::println);
		System.out.println(nombres25);
		System.out.println("-------------------");
		System.out.println(total);

	}

}
