package ejercicio5;

public class Triangulo extends Poligono {
	
	/**
	 * Constructor vacio
	 */
	public Triangulo() {
		super(3);
	}

	/**
	 * Lado 1 del triángulo
	 */
	protected double lado1;
	
	/**
	 * Lado 2 del triángulo
	 */
	protected double lado2;
	
	/**
	 * Lado 3 del triángulo
	 */
	protected double lado3;

	/**
	 * Constructor con parámetros
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		if(lado1 > 0) {
			this.lado1 = lado1;
		}
		
		if(lado2 > 0) {
			this.lado2 = lado2;
		}
		
		if(lado3 > 0) {
			this.lado3 = lado3;
		}
	}
	
	/**
	 * Devuelve el área del triángulo
	 * @return area
	 */
	@Override
	public double area() {
		return (lado1 + lado2 + lado3)/2;
	}
	
	@Override
	public String toString() {
		return "Triangulo cuyos lados miden: " + this.lado1 + ", " + this.lado2 + " y " + this.lado3;
	}
	
}
