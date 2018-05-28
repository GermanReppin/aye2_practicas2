package practica7;

public class Empleado {
	protected int legajo;
	protected int salario;
	
	public Empleado() {
		super();
		legajo = 0;
	}
	
	
	@Override 
	public int getIngresos() {
		return salario;
		// TODO  Auto-generated
	}
}
