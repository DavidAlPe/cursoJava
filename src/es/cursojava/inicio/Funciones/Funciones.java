package es.cursojava.inicio.Funciones;

public class Funciones {

	final static int NUMERO=4; //constante
	static int numero = 3; //variable
	
	public static void main(String[] args) {
		funcion1();
		String texto = "hola";
		funcion1(texto);
		int numero = 3;
		funcion1(numero);

		int edad =41;
		int anioNacimiento = calculaAnioNacimiento(edad);
		System.out.println(anioNacimiento);
	}
	
	//Sobrecarga
	public static void funcion1 () {
		System.out.println("Función1 llamada");
		
	}
	
	public static void funcion1 (String texto) {
		System.out.println("Función1 llamada "+ texto);
		
	}
	
	public static void funcion1 (int numero) {
		System.out.println("Función1 llamada "+ numero);
		
	}

	private static int calculaAnioNacimiento (int edad) {
		int anioNacimiento = 0;
		
		anioNacimiento =2024-edad;
		
		return anioNacimiento;
	}
	
	public static int calculaAnioNacimientoP (int edad) {
		int anioNacimiento = 0;
		
		anioNacimiento =2024-edad;
		
		return anioNacimiento;
	}
	
}
