package es.cursojava.poo.Ejercicios;

public class Aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno1 = new Alumno ("Pepito","Pérez", "123456",10,true);
		Alumno alumno2 = new Alumno ("Juanito","Valderrama", "562343",5,true);
		Alumno alumno3 = new Alumno ("Manolito","Cabezabolo", "265354",8,true);
		
		alumno1.verNota();
		alumno2.verNota();
		alumno3.verNota();
		
		Alumno aula [] =  {alumno1,alumno2,alumno3};
		
		System.out.println(" ");
		System.out.println("APROBADOS");
		for (int i=0;i<=2;i++) {
			aula[i].aprobado();
		}
		
	}

}
