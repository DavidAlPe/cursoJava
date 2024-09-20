package es.cursojava.poo.herencia;

public class Leon extends Animal {


	public Leon(String id, String nombre, String fechaNacimiento, double peso) {
		super(id, nombre, fechaNacimiento, peso);
	}
	@Override
	public void comer() {
		System.out.println("El animal "+nombre+ " está devorando");
	}
	public void beber (){
		System.out.println("El animal "+nombre+ " está bebiendo mucho 2");
	}


}
