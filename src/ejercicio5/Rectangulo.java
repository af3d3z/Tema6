package ejercicio5;

public class Rectangulo extends Poligono{
	
	/**
	 * Lado 1 del rectángulo
	 */
	private double lado1;
	
	/**
	 * Lado 2 del rectángulo
	 */
	private double lado2;
	
	/**
	 * Devuelve el atributo lado1
	 * @return
	 */
	public double getLado1 () {
		return this.lado1;
	}
	
	/**
	 * Devuelve el atributo lado2
	 * @return
	 */
	public double getLado2() {
		return this.lado2;
	}
	
	/**
	 * Cambia el valor al atributo lado1
	 * @param lado1
	 */
	public void setLado1(double lado1) {
		if(lado1 > 0) {
			this.lado1 = lado1;
		}
	}
	
	/**
	 * Cambia el valor al atributo lado2
	 * @param lado2
	 */
	public void setLado2(double lado2) {
		if(lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Constructor vacío
	 */
	public Rectangulo() {
		super(4);
	}
	
	/**
	 * Constructor con parámetros
	 * @param lado1
	 * @param lado2
	 */
	public Rectangulo (double lado1, double lado2) {
		super(4);
		if(lado1 > 0) {
			this.lado1 = lado1;
		}
		
		if(lado2 > 0) {
			this.lado2 = lado2;
		}
	}
	
	/**
	 * Calcula el area del rectángulo
	 */
	@Override
	public double area() {
		return lado1 * lado2;
	}
	
	
	@Override
	public String toString() {
		return "Rectángulo cuyos lados miden: " + this.lado1 + " y " + this.lado2;
	}

}
