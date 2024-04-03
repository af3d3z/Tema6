package ejercicio2;

public class Empleado {

	/**
	 * Nombre
	 */
	private String nombre = "";
	
	/**
	 * Constructor vacío
	 */
	public Empleado() {}
	
	/**
	 * Constructor con parámetros
	 * @param nombre
	 */
	public Empleado(String nombre) {
		if(nombre != null && !nombre.trim().equals("")) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Cambia el nombre del empleado
	 * @param nombre nuevo nombre del empleado
	 */
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.trim().equals("")) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Devuelve el nombre
	 * @return nombre
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Representa el objeto en una cadena
	 * @return nombre empleado y posicion
	 */
	@Override
	public String toString() {
		return "Empleado %s".formatted(this.nombre);
	}
}
