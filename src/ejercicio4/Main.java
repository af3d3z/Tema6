package ejercicio4;

public class Main {
	public static void main(String[] args) {
		double contadorElectrodomestico = 0;
		double contadorLavadora = 0;
		double contadorTelevision = 0;
		double total = 0;
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		electrodomesticos[0] = new Electrodomestico(300, 3);
		electrodomesticos[1] = new Lavadora(500, 90);
		electrodomesticos[2] = new Television(200, 10);
		electrodomesticos[3] = new Electrodomestico(700, 20, "GRIS", 'E');
		electrodomesticos[4] = new Television(1500, 40, "NEGRO", 'A', 50, true);
		electrodomesticos[5] = new Lavadora(140, 60, "BLANCO", 'C', 10);
		electrodomesticos[6] = new Electrodomestico(1200, 100, "GRIS", 'B');
		electrodomesticos[7] = new Television(200, 40, "AZUL", 'D', 50, false);
		electrodomesticos[8] = new Lavadora(1199, 300, "GRIS", 'A', 40);
		electrodomesticos[9] = new Electrodomestico(120, 30, "NEGRO", 'A');
		
		for(Electrodomestico elec : electrodomesticos) {
			double precio = 0;
			System.out.println(elec.toString());
			if(elec instanceof Television) {
				precio = elec.precioFinal();
				contadorTelevision += precio;
				total += precio;
			}else if(elec instanceof Lavadora) {
				precio = elec.precioFinal();
				contadorLavadora += precio;
				total += precio;
			}else {
				precio = elec.precioFinal();
				contadorElectrodomestico += precio;
				total += precio;
			}
			System.out.printf("Precio del electrodoméstico: %f\n\n", precio);
		}
		
		System.out.printf("Total Electrodomésticos varios:" + contadorElectrodomestico + "€\n");
		System.out.printf("Total Lavadoras:" + contadorLavadora+ "€\n");
		System.out.printf("Total Televisores:" + contadorTelevision + "€\n");
		System.out.printf("Total: " + total + "€");
		
	}
}
