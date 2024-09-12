package es.cursojava.inicio;

public class ClaseString {

	public static void main(String[] args) {
		String texto1 = "hola";
		String texto2 = "hola";
		String texto3 = new String ("hola");
		
		System.out.println(texto1==texto2); // == mira si está en la misma posición de memoria es decir si es el mismo objeto
		System.out.println(texto1==texto3);
		System.out.println(texto1.equals(texto3));
		System.out.println(texto1.equals(texto2));
		
		texto1.toUpperCase();
		System.out.println(texto1);
		
		// un string es inmutable
		
		texto1=texto1.toUpperCase();
		System.out.println(texto1);
		
		System.out.println(texto1 + " qué tal?");
		}

}
