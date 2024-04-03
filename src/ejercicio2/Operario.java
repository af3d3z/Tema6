package ejercicio2;

public class Operario extends Empleado{
	/**
	 * Constructor con parámetros
	 * @param nombre nombre del operario
	 */
	public Operario(String nombre) {
		super(nombre);
	}
	
	/**
	 * Representa el objeto en una cadena
	 * @return nombre empleado y posicion
	 */
	public String toString() {
		return super.toString() + " -> Operario";
	}
}
