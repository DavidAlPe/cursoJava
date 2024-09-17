package es.cursojava.poo.Ejercicios;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	private int nota;
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	private boolean mayorEdad;
		
	
	public Alumno() {
		super();
	}

	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Alumno(String nombre, String apellidos, String dni, int nota, boolean mayorEdad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.nota =nota;
		this.mayorEdad = mayorEdad;
	}


	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public int getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public boolean isMayorEdad() {
		return mayorEdad;
	}
	
	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}
	
	public void verNota() {
		if (mayorEdad) {
			if (nota==0) {
				System.out.println("El alumno "+ nombre +" "+ apellidos + " no ha estudiado nada");
			} else if (nota<=5) {
				System.out.println("El alumno "+ nombre +" "+  apellidos +" ha estudiado poco");
			}
			else if (nota<=9) {
				System.out.println("El alumno "+ nombre +" "+  apellidos + " ha estudiado mucho");
			}
			else if (nota<=10) {
				System.out.println("El alumno "+ nombre +" "+  apellidos + " es un genio");
			}
		}
		else {
			System.out.println("El alumno "+ nombre + apellidos + " no tiene permisos para ver la nota");
		}
		
	}
	
	public void aprobado() {
		if (this.nota>=5) {
			System.out.println("El alumno "+ this.nombre+ " "+this.apellidos+" ha aprobado");
		}	
	}
}
