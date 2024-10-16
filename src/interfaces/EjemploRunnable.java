package interfaces;

public class EjemploRunnable {

	public static void main(String[] args) {
		 
		Runnable task = () -> System.out.println("Tarea de ejemplo ejecutada");
	    new Thread(task).start();  
	}
}
