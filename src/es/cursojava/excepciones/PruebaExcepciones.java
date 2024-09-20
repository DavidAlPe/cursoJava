package es.cursojava.excepciones;

import java.nio.file.attribute.AclEntry;

import es.cursojava.poo.Ejercicios.Alumno;

public class PruebaExcepciones {

	public static void main (String[] args) {
		int [] numeros = {1,2,3};
		Alumno alumno1=null;
		try {
			System.out.println(numeros[1]);	
			System.out.println("hola");
			alumno1.getDni();

		} catch (Exception e) {
			System.out.println("Se ha producido un error al acceder a una posición del array");
		}finally {
			//Se utiliza para el cierre de conexiones con las BBDD o cerrar un fichero
			System.out.println("Esto se ejecuta siempre");
		}
		System.out.println("FIN");
	}
}
