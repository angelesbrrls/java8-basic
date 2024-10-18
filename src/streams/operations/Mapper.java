package streams.operations;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//mapa que agrupe nombres por la primera letra
public class Mapper {
	
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Luke", "Brandon", "Steve", "David", "Diana", "Donna");

        Map<Character, List<String>> agrupados = nombres.stream()
                .collect(Collectors.groupingBy(nombre -> nombre.charAt(0))); 

        System.out.println(agrupados);

    }

}
