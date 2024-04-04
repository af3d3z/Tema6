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
	
	public Lavadora(double precio, double peso) {
		super();
		this.carga = 5;
	}
	
	public Lavadora(double precioBase, double peso, String color, char consumo, double carga) {
    	super(precioBase, peso, color, consumo);
    	if(carga > 0) {
    		this.carga = carga;
    	}
    }

	public double getCarga() {
		return carga;
	}
	
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if(carga > 30) {
			precioFinal += 30;
		}
		
		return precioFinal;
	}
	
}
