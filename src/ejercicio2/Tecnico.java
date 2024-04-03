package ejercicio2;

public class Tecnico extends Operario{
	/**
	 * Constructor con parámetros
	 * @param nombre nombre del técnico
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}
	/**
	 * Representa el objeto en una cadena
	 * @return nombre empleado y posicion
	 */
	public String toString() {
		return super.toString() + " -> Tecnico";
	}
}
