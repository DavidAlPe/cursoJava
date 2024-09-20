package es.cursojava.poo.herencia;

public class Zoologico {

	public static void main(String[] args) {
		
		Leon leon1 = new Leon ("1","V1","123123",250.6);
		Vaca vaca1 = new Vaca ("1","L1","123123",250.6);
		
		leon1.comer();
		vaca1.comer();
		leon1.beber();
	
		System.out.println(vaca1);
	}

}
