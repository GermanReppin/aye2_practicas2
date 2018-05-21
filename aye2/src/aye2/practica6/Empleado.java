package aye2.practica6;

public class Empleado {
	private int numero;
	private string nombre;
	
	
	public Empleado() {
		numero = 0;
		nombre = "";
	}
	
	public Empleado(int n, String nombre) {
		numero = n;
		this.nombre = nombre;
		
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public string getNombre() {
		return nombre;
	}
	
	public void setNombre(string nombre) {
		this.nombre = nombre;
	}
	
	public void verdatos() {
		System.out.println("Empleado nro " + numero + ":  " + nombre);
	}
		

}
