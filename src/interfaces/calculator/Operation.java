package interfaces.calculator;

public class Operation {

	  public static void main(String[] args) {
	       
	        Calculator suma = (a, b) -> a + b;
	        
	        Calculator resta = (a, b) -> a - b;
	        
	        Calculator multiplicacion = (a, b) -> a * b;
	        
	        Calculator division = (a, b) -> {
	            if (b == 0) {
	                throw new IllegalArgumentException("No se puede dividir por cero");
	            }
	            return a / b;
	        };

	        System.out.println("Suma: " + apply(10, 50, suma));           
	        System.out.println("Resta: " + apply(200, 10, resta));         
	        System.out.println("Multiplicación: " + apply(30, 15, multiplicacion)); 
	        System.out.println("División: " + apply(400, 200, division)); 
	        
	    }

	    // Método que recibe dos números y una operación
	    public static int apply(int a, int b, Calculator calculador) {
	        return calculador.apply(a, b);
	    }

}
