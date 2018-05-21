package aye2.practica6;

public class pruebasPractica6 {

	public static void main(String[] args) {
		
		Lamparita lamp1 = new Lamparita();
		
		System.out.println("La lamparita esta " + lamp1.getEstado().toString());
        
		lamp1.encender();
		
		System.out.println("La lamparita esta " + lamp1.getEstado());
		
		
		//Ejercicio 6: Prueba de Hora
		Hora h1 = new Hora(1, 140, 160);
		Hora h2 = new hora(2, 35, 102);
		
		System.out.println("La hora h1 es: " + h1.toString());
		
		System.out.println("La suma de h1 y h2 es; " + Hora.sumar(h1, h2)); // es igual que hacer: System.out.println("La suma de h1 y h2 es; " + h1);
		
		
	}

}
