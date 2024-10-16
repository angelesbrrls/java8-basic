package lambda;

public class LambdaRunnable {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
		    @Override
		    public void run() {
		        System.out.println("Hola desde un hilo 1");
		    }
		};
		
		Runnable r2 = () -> System.out.println("Hola desde un hilo 2");

		// Ejecutar los hilos
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        
        thread1.start(); // Ejecutar el hilo R1
        thread2.start(); // Ejecutar el hilo R2
	}

}
