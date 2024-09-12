package es.cursojava.inicio.condicionales;

public class EjemploSwitch {

	public static void main(String[] args) {
		String mes = "Marzo";
		
		switch (mes) {
		case "Enero": 
		case "Febreo": 
		case "Marzo": System.out.println("Invierno");break;
		case "Abril": 
		case "Mayo": 
		case "Junio": System.out.println("Primavera");break;
		case "Julio": 
		case "Agosto": 
		case "Septiembre": System.out.println("Verano");break;
		case "Octubre": 
		case "Noviembre": 
		case "Diciembre": System.out.println("Otoño");break;
		default: System.out.println("Mes incorrecto"); break;
		}

	}

}
