package es.cursojava.poo.herencia;

public class Serpiente extends Animal {
	private Boolean venenosa;
	
	public Serpiente(String id, String nombre, String fechaNacimiento, double peso) {
		super(id, nombre, fechaNacimiento, peso);
		// TODO Auto-generated constructor stub
	}
	
	
	public Serpiente(String id, String nombre, String fechaNacimiento, double peso, boolean venenosa) {
		super(id, nombre, fechaNacimiento, peso);
		this.venenosa = venenosa;
	}

	@Override
	public void comer() {
		System.out.println("El animal "+nombre+ " está tragando");

	}

}
