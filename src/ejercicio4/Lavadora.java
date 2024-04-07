package ejercicio4;

/**
 * Representa al electrodomestico lavadora la cual conserva los atributos de su clase padre
 * y ademas se le añade el atributo carga que representa el peso de la carga que soporta.
 */
public class Lavadora extends Electrodomestico{
	/**
	 * Almacena el peso de la carga que soporta la lavadora (en kilos)
	 */
	protected double carga;
	/**
	 * Constructor vacio
	 */
	public Lavadora() {}
	
	/**
	 * Constructor con parámetros por defecto
	 * @param precio
	 * @param peso
	 */
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = 5;
	}
	
	/**
	 * Constructor con todos los parámetros
	 * @param precioBase
	 * @param peso
	 * @param color
	 * @param consumo
	 * @param carga
	 */
	public Lavadora(double precioBase, double peso, String color, char consumo, double carga) {
    	super(precioBase, peso, color, consumo);
    	if(carga > 0) {
    		this.carga = carga;
    	}
    }

	/**
	 * Devuelve la carga en kilos
	 * @return carga de la lavadora
	 */
	public double getCarga() {
		return carga;
	}
	
	/**
	 * Calcula el precio final de la lavadora
	 * @return prefio final de la lavadora
	 */
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if(carga > 30) {
			precioFinal += 30;
		}
		
		return precioFinal;
	}
	
	@Override
	public String toString() {
		return "Lavadora " + super.toString() + "Carga: " + this.carga;
	}
	
}
