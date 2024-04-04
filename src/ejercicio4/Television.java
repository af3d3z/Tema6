package ejercicio4;

/**
 * Representa un electrodoméstico de tipo televisión, mantendrá los atributos de su clase padre
 * y se le añadirán los atributos resolución y pulgadas
 */
public class Television extends Electrodomestico{
	/**
	 * Almacena cuantas pulgadas tiene la television
	 */
	protected int resolucion;
	
	/**
	 * Indica si tiene un TDT o no
	 */
	protected boolean sintonizador;
	
	/**
	 * Constructor vacio
	 */
	public Television() {}
	
	/**
	 * Constructor con parámetros precio, peso y valores por defecto
	 * @param precio
	 * @param peso
	 */
	public Television(double precio, double peso) {
		super();
		this.resolucion = 20;
		this.sintonizador = false;
	}
	
	/**
	 * Constructor con todos los parámetros
	 * @param precioBase
	 * @param peso
	 * @param color
	 * @param consumo
	 * @param resolucion
	 * @param sintonizador
	 */
	public Television (double precioBase, double peso, String color, char consumo, int resolucion, boolean sintonizador) {
    	super();
    	if(resolucion > 0) {
    		this.resolucion = resolucion;
    	}
    	
    	this.sintonizador = sintonizador;
    }

	
	public int getResolucion() {
		return this.resolucion;
	}
	
	public boolean getSintonizador() {
		return this.sintonizador;
	}
	
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if(resolucion < 40) {
			precioFinal += precioFinal * 0.3;
		}
		
		if(sintonizador) {
			precioFinal += 50;
		}
		
		return precioFinal;
	}
}
