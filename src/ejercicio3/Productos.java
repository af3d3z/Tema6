package ejercicio3;

/**
 * Clase Producto que representa un producto como un nombre y un precio
 */
public class Productos {
	/**
	 * Nombre del producto
	 */
	private String nombre = "";
	
	/**
	 * Precio del producto
	 */
	private double precio;
	
	/**
	 * Constructor vacio
	 */
	public Productos() {}
	
	/**
	 * Constructor con parámetros
	 * @param nombre
	 * @param precio
	 */
	public Productos(String nombre, double precio) {
		if(nombre != null && !nombre.trim().equals("")) {
			this.nombre = nombre;
		}
		if(precio > 0) {
			this.precio = precio;
		}
	}
	
	/**
	 * Devuelve el nombre del producto
	 * @return nombre producto
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Devuelve el precio de un producto
	 * @return precio del producto
	 */
	public double getPrecio() {
		return this.precio;
	}
	
	/**
	 * Cambia el nombre del producto
	 * @param nombre nuevo
	 */
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.trim().equals("")) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Cambia el precio del producto
	 * @param precio nuevo
	 */
	public void setPrecio(double precio) {
		if(precio > 0) {
			this.precio = precio;
		}
	}
	
	/**
	 * calculamos el importe de los productos
	 * @param cantidad
	 * @return total
	 */
	public double calcular(int cantidad) {
		return this.precio * cantidad;
	}
	
	@Override
	public String toString() {
		return "%s: %f€".formatted(this.nombre, this.precio);
	}
}
