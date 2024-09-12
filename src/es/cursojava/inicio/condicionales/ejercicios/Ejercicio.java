package es.cursojava.inicio.condicionales.ejercicios;

public class Ejercicio {

	public static void main(String[] args) {
		
		String mes = "Enero";
		
		if ((mes.equals ("Enero"))||(mes.equals ("Febrero"))||(mes.equals ("Marzo"))){
			System.out.println(mes + " "+ "es invierno");			
		} else if ((mes.equals ("Abril"))||(mes.equals ("Nayo"))||(mes.equals ("Junio"))) {
			System.out.println(mes + " "+ "es primavera");
		}else if ((mes.equals ("Julio"))||(mes.equals ("Agosto"))||(mes.equals ("Septiembre"))) {
			System.out.println(mes + " "+ "es verano");
		}else if ((mes.equals ("Octubre"))||(mes.equals ("Noviembre"))||(mes.equals ("Diciembre"))){
			System.out.println(mes + " "+ "es otoño");
		}
		else {
			System.out.println("Mes incorrecto");
		}
	}
	
}
