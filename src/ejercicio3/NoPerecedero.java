package ejercicio3;
/**
 * Representa aquellos productos 
 */
public class NoPerecedero extends Productos {
	/**
	 * Tipo de producto
	 */
	private String tipo;
	
	/**
	 * Constructor vacio
	 */
	public NoPerecedero() {}
	
	/**
	 * Constructor con parámetros
	 * @param nombre
	 * @param precio
	 * @param tipo
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		if(tipo != null && !tipo.trim().equals("")) {
			this.tipo = tipo;
		}
	}

	/**
	 * Cambia el tipo de un producto no perecedero
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		if(tipo != null && tipo.trim().equals("")) {
			this.tipo = tipo;
		}
	}
	
	/**
	 * calculamos el importe de los productos
	 * @param cantidad
	 * @return total
	 */
	public double calcular(int cantidad) {
		return super.calcular(cantidad);
	}
	
	/**
	 * Devuelve el nombre de producto, precio y tipo
	 * de la siguiente forma: nombre: precio€ Tipo: tipo
	 */
	public String toString() {
		return "%s: %f€ Tipo: %s".formatted(super.getNombre(), super.getPrecio(), this.tipo);
	}
}
