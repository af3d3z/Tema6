package ejercicio3;

public class Main {
	public static void main(String[] args) {
		// Clase Productos
		Productos p1 = new Productos("Clorox", 2.9);
		System.out.println(p1);
		System.out.println("Total: " + p1.calcular(3));
		
		// Clase NoPerecederos
		NoPerecedero np = new NoPerecedero("Lejía", 2.5, "Limpieza");
		System.out.println(np);
		System.out.println("Total:" + np.calcular(4));
		
		// Clase perecederos
		Perecedero pe1 = new Perecedero("Patatas fritas congeladas", 1.9, 4);
		System.out.println(pe1);
		System.out.println("Total:" + pe1.calcular(2));
		pe1.setDiasACaducar(3);
		System.out.println(pe1);
		System.out.println("Total:" + pe1.calcular(2));
		pe1.setDiasACaducar(2);
		System.out.println(pe1);
		System.out.println("Total:" + pe1.calcular(2));
		pe1.setDiasACaducar(1);
		System.out.println(pe1);
		System.out.println("Total:" + pe1.calcular(2));
	}
}
