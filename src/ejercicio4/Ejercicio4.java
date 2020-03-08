package ejercicio4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Ejercicio4 {
	

	private static DateTimeFormatter normal = DateTimeFormatter.ofPattern("dd/LL/yyyy");
	private static DateTimeFormatter americano = DateTimeFormatter.ofPattern("yyyy/LL/dd");
	
	
	private Ejercicio4() {
		
	}
	
	public static String normalToAmericano(String fecha) {
		
		LocalDate fechaActual;
		
		try {
			fechaActual = LocalDate.parse(fecha, normal);
		} catch (DateTimeParseException e) {
			throw new IllegalArgumentException("Formato inválido");
		}
		
		return fechaActual.format(americano);

	}
	
	public static String americanoToNormal(String fecha) {
		
		LocalDate fechaActual;
		
		try {
			fechaActual = LocalDate.parse(fecha, americano);
		} catch (DateTimeParseException e) {
			throw new IllegalArgumentException("Formato inválido");
		}
		
		return fechaActual.format(normal);
		
	}
	
	public static void main(String[] args) {
		System.out.printf("Fecha en formato original: 10/02/2020.\nFecha en formato americano: %s%n", 
				Ejercicio4.normalToAmericano("30/01/1990"));
		
		System.out.printf("\nFecha en formato americano: 2020/02/10. \nFecha en formato normal: %s",
				Ejercicio4.americanoToNormal("1990/01/30"));
	}
	
}
