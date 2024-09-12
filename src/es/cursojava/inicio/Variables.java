package es.cursojava.inicio;

public class Variables {
	//Variables de instancia
	
	public static void main(String[] args) {
		//Variables locales
		//Tipos primitivos
		//Enteros
		byte num1 = 100; //-128 a 128
		short num2 = 2; //
		int num3 = 7;
		long num4 = 123123;
		
		
		//Decimales
		double decimal = 7.5;
		float decimal1 = 5.6f;
		
		
		char caracter = 'a';
		
		boolean esMayorEdad = true; // Siempre en minusculas
		
		//Tipo objeto
		String mensaje = "Hola Mundo"; //Clase proporcionada por java
		int [] numeros = {1,2,3};
		
		System.out.println(mensaje + num3 + 3);
		System.out.println(mensaje + (num3 + 3));
		System.out.println(mensaje + (num3 + 3) + 6);
		System.out.println(num3 + 3 + mensaje);
		System.out.println(num3 + 3);
		
	}

}
