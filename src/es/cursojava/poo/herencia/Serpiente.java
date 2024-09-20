package es.cursojava.poo.herencia;

public class Serpiente extends Animal {

	public Serpiente(String id, String nombre, String fechaNacimiento, double peso) {
		super(id, nombre, fechaNacimiento, peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer() {
		System.out.println("El animal "+nombre+ " está tragando");

	}

}
