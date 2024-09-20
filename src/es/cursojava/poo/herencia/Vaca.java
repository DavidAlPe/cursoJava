package es.cursojava.poo.herencia;

public class Vaca extends Animal{
	private String tipo;

	
	public Vaca(String id, String nombre, String fechaNacimiento, double peso) {
		super(id, nombre, fechaNacimiento, peso);
		this.tipo="Lechera";
	}

	public Vaca(String id, String nombre, String fechaNacimiento, double peso, String tipo) {
		super(id, nombre, fechaNacimiento, peso);
		this.tipo = tipo;
	}

	@Override
	public void comer() {
		System.out.println("El animal "+nombre+ " está pastando");
		
	}

	@Override
	public String toString() {
		return "Vaca [tipo=" + tipo + ", nombre= " + nombre + ", Id= " + getId() + ", FechaNacimiento= " + getFechaNacimiento() + ", Peso= " + getPeso() + "]";
	}


	
	
}
