package ejercicio4;

/**
 * Clase que definirá qué es un electrodoméstico y contendrá atributos como
 * precio, color, consumo y peso.
 */
public class Electrodomestico {
	/**
	 * Tipo que contiene los colores disponibles
	 */
	protected enum COLOR {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}
	
	/**
	 * Tipo que representa el consumo energético
	 */
	protected enum CONSUMO {
		A, B, C, D, E, F
	}
	
	/**
	 * Representa el precio mínimo del electrodoméstico
	 */
	protected double precioBase;
	/**
	 * Representa el color del electrodoméstico
	 */
	protected COLOR color;
	
	/**
	 * Representa el consumo del electrodomestico
	 */
	protected CONSUMO consumo;
	
	/**
	 * Representa el peso del electrodoméstico
	 */
	protected double peso;
	
	/**
	 * Constructor vacio
	 */
	public Electrodomestico () {}
	
	/**
	 * Constructor con el precio base, peso y parámetros por defecto
	 * @param precioBase
	 * @param peso
	 */
    public Electrodomestico(double precioBase, double peso) {
        this.color = COLOR.BLANCO;
        this.consumo = CONSUMO.B;
        if(precioBase > 0) {
        	this.precioBase = precioBase;
        }
        if(peso > 0) {
        	this.peso = peso;
        }
    }
    
    /**
     * Constructor con todos los parametros
     * @param precioBase
     * @param peso
     * @param color
     * @param consumo
     */
    public Electrodomestico(double precioBase, double peso, String color, char consumo) {
    	if(precioBase > 0) {
        	this.precioBase = precioBase;
        }
        if(peso > 0) {
        	this.peso = peso;
        }
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumo);
    }
    
    /**
     * Devuelve el precio base
     * @return precio base del electrodomestico
     */
	public double getPrecioBase () {
		return this.precioBase;
	}
	
	/**
//	 * Devuelve el peso
	 * @return peso del electrodomestico
	 */
	public double getPeso() {
		return this.peso;
	}
	
	/**
	 * Devuelve el color
	 * @return color del electrodomestico
	 */
	public COLOR getColor() {
		return this.color;
	}
	
	/**
	 * Devuelve el consumo
	 * @return consumo del electrodomestico
	 */
	public CONSUMO getConsumo() {
		if(this.consumo == null) {
			this.consumo = CONSUMO.B;
		}
		return this.consumo;
	}
	
	/**
	 * Comprueba que el consumo energético está dentro de los tipos de consumo establecidos y si no, le asigna la B
	 * @param letra
	 * @return consumo correspondiente
	 */
	public static CONSUMO comprobarConsumoEnergetico(char letra) {
        String consumos = "ABCDEF";
        if (!(consumos.contains(String.valueOf(letra)))) {
            return CONSUMO.B;
        } else {
            return CONSUMO.valueOf(Character.toString(letra));
        }
    }
	
	/**
	 * Comprobamos que el color está dentro de los establecidos
	 * @param color
	 * @return color correspondiente
	 */
	public static COLOR comprobarColor (String color) {
		COLOR res = COLOR.BLANCO;
		if(color.equalsIgnoreCase("NEGRO")) {
			res = COLOR.NEGRO;
		}else if(color.equalsIgnoreCase("AZUL")) {
			res = COLOR.AZUL;
		}else if(color.equalsIgnoreCase("ROJO")) {
			res = COLOR.ROJO;
		}else if(color.equalsIgnoreCase("GRIS")) {
			res = COLOR.GRIS;
		}
		
		return res;
	}
	
	public double precioFinal() {

        double precioFinal = 0.0;

        switch (getConsumo()) {
            case A:
                precioFinal = getPrecioBase() + 100;
                break;
            case B:
                precioFinal = getPrecioBase() + 85;
                break;
            case C:
                precioFinal = getPrecioBase() + 60;
                break;
            case D:
                precioFinal = getPrecioBase() + 50;
                break;
            case E:
                precioFinal = getPrecioBase() + 30;
                break;
            case F:
                precioFinal = getPrecioBase() + 10;
                break;
        }

        if (getPeso() <= 19) {
            precioFinal += 10;
        } else if (getPeso() <= 49) {
            precioFinal += 50;
        } else if (peso <= 79) {
            precioFinal += 80;
        } else {
            precioFinal += 100;
        }
        return precioFinal;
    }

	@Override
	public String toString() {
		return "Precio Base: " + this.precioBase + "€ Peso:" + this.peso + " Consumo: " + this.consumo + " Color: " + this.color + " ";
	}

}
