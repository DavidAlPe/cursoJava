package es.cursojava.poo;

public class Cine {

	public static void main(String[] args) {
	
		Persona persona1 = new Persona(); // constructor vacío, creado al haber creado uno inicializado
		persona1.setNombre("Juan Francisco"); 
		persona1.setApellidos("Palomo Guisado");
		persona1.setDni("88888888L");
		persona1.setAltura(152.6);
		persona1.setPeso(52.3);
		
		System.out.println("PERSONA 1:");
		System.out.println("Nombre: "+persona1.getNombre());
		System.out.println("Apellidos: "+persona1.getApellidos());
		System.out.println("DNI: "+ persona1.getDni());
		System.out.println("Altura: "+persona1.getAltura());
		System.out.println("Peso: "+persona1.getPeso());

		Persona persona2 = new Persona ("David", "Alejandre Penia", "756894123");// constructor creado para rellenar datos
		System.out.println();
		
		System.out.println("PERSONA 2:");
		System.out.println("Nombre: "+ persona2.getNombre());
		System.out.println("Apellidos: " + persona2.getApellidos());
		System.out.println("DNI: " + persona2.getDni());
		System.out.println("Altura: " + persona2.getAltura());
		System.out.println("Peso: " + persona2.getPeso());
		
	}

}
