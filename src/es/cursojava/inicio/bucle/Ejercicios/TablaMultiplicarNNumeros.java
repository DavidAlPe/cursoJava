package es.cursojava.inicio.bucle.Ejercicios;

public class TablaMultiplicarNNumeros {

	public static void main(String[] args) {
		// Tabla de multiplicar de de todos los numeros
		for (int i=0;i<=10;i++) {
			System.out.println("Tabla del: "+ i);
			for (int j=1;j<=10;j++){
			System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
		
		System.out.println("Finalizado el bucle FOR");
	}
}
