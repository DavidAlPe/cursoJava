package es.cursojava.inicio.bucle;

public class EjemploDoWhile {

	public static void main(String[] args) {
		// Bucle DoWhile, hacer mientras se cumpla la condición, se va a ejecutar al menos una vez
		int i = 0;
		do {
			System.out.println("Hola Amiguete --> "+ i + "  antes");
			i++;
			System.out.println("Hola Amiguete --> "+ i + "  después");
		}while (i<8);
		System.out.println("Fin bucle DoWhile");		
	}
}
