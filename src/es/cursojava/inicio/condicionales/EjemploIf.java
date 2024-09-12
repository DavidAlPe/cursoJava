package es.cursojava.inicio.condicionales;

public class EjemploIf {

	public static void main(String[] args) {
		
		int numero = 5;
		int nota = 6;
		
		if (numero%2==0) {
			System.out.println("El número es par");
		
		}
		else {
			System.out.println("El número es impar");
			
		}
		if (nota<5) {
			System.out.println("Suspenso");
		}else if (nota<5) {
			System.out.println("Suspenso");
			
		}else if (nota<7) {
			System.out.println("Aprobado");
			
		}else if (nota<9) {
			System.out.println("Notable");
			
		}else {
			System.out.println("Sobresaliente");
			
		}
				
		//++ aumenta en el valor de un entero
		System.out.println(nota++);//me pinta 6 pero el valor pasa a 7
		System.out.println(++nota);// primero aumenta el valor el después lo pinta
		
		System.out.println(nota+=3);//11
		nota = nota + 3;
		System.out.println(nota);//14
		
		System.out.println("Fin");
		
	}

}
