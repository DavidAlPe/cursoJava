package es.cursojava.poo.herencia;

public class Zoologico {

	public static void main(String[] args) {
		
		Leon leon1 = new Leon ("1","Leon11","123123",250.6);
		Vaca vaca1 = new Vaca ("1","vaca11","123123",250.6);
		Serpiente serpiente1 = new Serpiente ("1","Serpiente1","123123",250.6,true);
		leon1.comer();
		vaca1.comer();
		serpiente1.comer();
		
		//System.out.println(vaca1); // metodo sobreesctio to strin en la clase vaca
		Animal [] animales = {leon1,vaca1,serpiente1};
		
		for (Animal animal : animales) {
			animal.beber();
			
		}
	}

}
