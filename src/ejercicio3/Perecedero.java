package ejercicio3;

import java.time.LocalDateTime;

/**
 * Clase que representa aquellos productos que tienen caducidad
 */
public class Perecedero extends Productos{
	/**
	 * Dias a caducar
	 */
	private int diasACaducar;
	
	/**
	 * Constructor vacio
	 */
	public Perecedero() {}
	
	/**
	 * Constructor con parámetros
	 * @param dias
	 */
	public Perecedero(String nombre, double precio, int dias) {
		super(nombre, precio);
		if(dias > 0) {
			this.diasACaducar = dias;
		}
	}
	
	/**
	 * Cambia los dias a caducar de un producto
	 * @param dias
	 */
	public void setDiasACaducar(int dias) {
		if(dias > 0) {
			this.diasACaducar = dias;
		}
	}
	
	/**
	 * Devuelve los dias que le quedan al proucto para que caduque
	 * @return dias a caducar
	 */
	public int getDiasACaducar() {
		return this.diasACaducar;
	}
	
	/**
	 * calculamos el importe de los productos.
	 * dependiendo de los días a caducar se aplicará un descuento u otro
	 * si quedan 3 dias para que caduque, se queda a mitad de precio,
	 * si quedan 2 dias para que caduque, su precio se divide entre 3,
	 * si queda 1 dia para que caduque, su precio se divide entre 4.
	 * @param cantidad
	 * @return total
	 */
	public double calcular(int cantidad) {
		double precio = super.getPrecio() * cantidad;
		
		switch(diasACaducar) {
			case 1: {
				precio /= 4;
				break;
			}
			case 2: {
				precio /= 3;
				break;
			}
			case 3: {
				precio /= 2;
			}
		}
		
		return precio;
	}
	
	/**
	 * Devuelve el nombre de producto, precio y fecha de caducidad
	 * de la siguiente forma: nombre: precio€ Fecha caducidad: 00/00/0000
	 */
	public String toString() {
		LocalDateTime hoy = LocalDateTime.now();
		return "%s: %f€ Fecha caducidad: %s".formatted(super.getNombre(), super.getPrecio(), hoy.plusDays(diasACaducar));
	}
}
