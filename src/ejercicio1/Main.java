package ejercicio1;

public class Main {

	public static void main(String[] args) {
		// HORA
		Hora hora = new Hora(13, 25);


		if (hora.setMinuto(59)) {
			System.out.println("Se han podido cambiar los minutos");			
		}else {
			System.out.println("No se han podido cambiar los minutos");			
		}

		if (hora.setMinuto(800)) {
			System.out.println("Se han podido cambiar los minutos");			
		}
		else {
			System.out.println("No se han podido cambiar los minutos");			
		}

		hora.inc();
		
		if (hora.setHora(15)) {
			System.out.println("Se ha podido cambiar la hora");
			
		}else {
			System.out.println("No se ha podido cambiar la hora");			
		}

		System.out.println(hora);

		// HORA EXACTA

		HoraExacta horaExacta = new HoraExacta(0, 43, 59);

		System.out.println(horaExacta);
		if (horaExacta.setHora(19))
			System.out.println("Se ha podido cambiar la hora");
		else
			System.out.println("No se ha podido cambiar la hora");

		if (horaExacta.setMinuto(59))
			System.out.println("Se han podido cambiar los minutos");
		else
			System.out.println("No se han podido cambiar los minutos");

		if (horaExacta.setSegundo(800))
			System.out.println("Se han podido cambiar los minutos");
		else
			System.out.println("No se han podido cambiar los minutos");

		horaExacta.inc();

		System.out.println(horaExacta);
	}
}