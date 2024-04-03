package ejercicio2;

public class Oficial extends Operario{
	/**
	 * Constructor con parámetros
	 * @param nombre nombre del oficial
	 */
	public Oficial (String nombre) {
		super(nombre);
	}
	
	/**
	 * Representa el objeto en una cadena
	 * @return nombre empleado y posicion
	 */
	public String toString() {
		return super.toString() + " -> Oficial";
	}
}
