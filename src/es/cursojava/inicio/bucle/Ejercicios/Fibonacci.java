package es.cursojava.inicio.bucle.Ejercicios;

public class Fibonacci {

	public static void main(String[] args) {
		int primero = 0;
		int segundo = 1;
		int fibonacci = 0;

		System.out.print(primero + " ");
		System.out.print(segundo + " ");

		for (int i = 1; i < 10; i++) {

			fibonacci = primero + segundo;
			System.out.print(fibonacci + " ");

			primero = segundo;
			segundo = fibonacci;
		}
	}

}
