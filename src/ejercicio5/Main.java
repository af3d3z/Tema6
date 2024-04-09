package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	public static int menu() {
		int opcion = 0;
		
		do {
			try {
				System.out.println("1. Introducir triángulo.");
				System.out.println("2. Introducir rectángulo.");
				System.out.println("3. Mostrar array");
				opcion = sc.nextInt();				
			}catch(InputMismatchException e) {
				System.err.println("Valor inválido.");
				sc.nextLine();
			}
		}while(opcion < 1 || opcion > 3);
		
		return opcion;
	}
	
	static int posicionLibre(Poligono[] array) {
		// contador de posiciones
		int contador = 0;
		boolean encontrado = false;
		
		for(int i = 0; i < array.length && !encontrado; i++) {
			if(array[i] == null) {
				encontrado = true;
				continue;
			}
			contador++;
		}
		
		if(contador == array.length) {
			contador = -1;
		}
		
		return contador;
	}
	
	static Triangulo crearTriangulo() {
		double lado1 = 0;
		double lado2 = 0;
		double lado3 = 0;
		
		do {
			try {
				System.out.println("Introduce uno de sus lados: ");
				lado1 = sc.nextDouble();
				sc.nextLine();
				System.out.println("Introduce el segundo de sus lados: ");
				lado2 = sc.nextDouble();
				sc.nextLine();
				System.out.println("Introduce el tercero de sus lados: ");
				lado3 = sc.nextDouble();
				sc.nextLine();
			}catch(InputMismatchException e) {
				System.err.println("Valor inválido.");
				sc.nextLine();
			}
		}while(lado1 <= 0 || lado2 <= 0 || lado3 <= 0);
		
		return new Triangulo(lado1, lado2, lado3);
	}
	
	static Rectangulo crearRectangulo() {
		double lado1 = 0;
		double lado2 = 0;
		
		do {
			try {
				System.out.println("Introduce la base: ");
				lado1 = sc.nextDouble();
				sc.nextLine();
				System.out.println("Introduce la altura: ");
				lado2 = sc.nextDouble();
				sc.nextLine();
			}catch(InputMismatchException e) {
				System.err.println("Valor inválido.");
				sc.nextLine();
			}
		}while(lado1 <= 0 || lado2 <= 0 );
		
		return new Rectangulo(lado1, lado2);
	}

	
	public static void main(String[] args) {
		Poligono[] poligonos = new Poligono[10];
		int option;
		int posLibre = 0;
		
		do {
			option = menu();
			switch(option) {
				case 1: {
					posLibre = posicionLibre(poligonos);
					poligonos[posLibre] = crearTriangulo();
					break;
				}
				case 2: {
					posLibre = posicionLibre(poligonos);
					poligonos[posLibre] = crearRectangulo();
					break;
				}
				case 3: {
					for(Poligono poli: poligonos) {
						if(poli != null)
							System.out.println(poli);
					}
				}
			}
			
		}while(option != -1);
	}
}
