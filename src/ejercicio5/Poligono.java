package ejercicio5;

public abstract class Poligono {
	/**
	 * Numero de lados del polígonos
	 */
	protected int numeroLados;
	
	/**
	 * Constructor con parámetros
	 * @param numeroLados
	 */
	public Poligono(int numeroLados) {
		if(numeroLados > 0) {
			this.numeroLados = numeroLados;
		}
	}
	
	/**
	 * Devuelve el numero de lados del poligono
	 * @return
	 */
	public int getNumeroLados() {
		return this.numeroLados;
	}
	
	/**
	 * Devuelve una cadena indicativa con el numero el numero de lados
	 */
	@Override
	public String toString() {
		return "Tiene " + numeroLados + " lados.";
	}
	
	public abstract double area();
}
