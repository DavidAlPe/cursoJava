package es.cursojava.inicio.bucle;

public class EjemploFor {

	public static void main(String[] args) {
		
		//BUCLE FOR, un grupo de sentencias repetida n veces
		//1ª inicializacion de variables
		//2ª condición que se tiene que cumplir para que el bucle se ejecute
		//3ª modificación de la variable por cada iteración
		
		for (int i=0;i<=5;i++) {
			if (i > 3) {
				break; // sale del bucle y no ejecuta nada más del FOR
			}
			if (i%2==0) {
				continue; // cuando pasa por esta sentencia para la iteración y vuelve a entrar en el bucle, suma uno
			}
			System.out.println("Hola Amigo --> " + i);
		}
		
		System.out.println("Finalizado el bucle FOR");

	}

}
