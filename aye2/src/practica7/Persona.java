package practica7;

import java.util.Date;

public class Persona {
	protected String nombre;
	protected int dni;
	protected Date fechaDeNacimiento;
	protected Persona pareja;
	
	
	public Persona() {
		nombre = new String("");
		fechaDeNacimiento = new Date("");
	
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	public Persona getPareja() {
		return pareja;
	}


	public void setPareja(Persona pareja) {
		this.pareja = pareja;
	}
	

	public boolean tienePareja() {
		return pareja != null;
	}
	
	public boolean getPareja (Persona p) {
		if (tienePareja()) {
			p.clone(pareja);
			return true;}
		else {
			return false
		}
	}
	
	
	/* public persona clone(persona p) {
	 peersona p2= new persona(;
	 p2.dni = p.dni;
	 p2.nombre = p.nombre*/
	 */
	
	 
	
}

