package ejercicio2;

public class Directivo extends Empleado {
	
	/**
	 * Constructor con parámetros
	 */
	public Directivo(String nombre) {
		super(nombre);
	}
	
	/**
	 * Representa el objeto en una cadena
	 * @return nombre empleado y posicion
	 */
	public String toString() {
		return super.toString() + " -> Directivo";
	}
 }
