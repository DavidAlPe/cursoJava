package es.cursojava.inicio.bucle.Ejercicios;

public class TablaMultiplicarNumero {

	public static void main(String[] args) {
		// Tabla de multiplicar de un número del 1 al 10
		int numero = 2;
		for (int i=0;i<=10;i++) {
			System.out.println(numero + " x " + i + " = " + (i*numero));
		}
		
		System.out.println("Finalizado el bucle FOR");
	}
}
