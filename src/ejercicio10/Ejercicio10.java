package ejercicio10;

import java.time.LocalDate;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(1996, 9, 1);

		System.out.println(esBisiesto(date));
	}
	
	public static boolean esBisiesto(LocalDate fecha) {
		
		int año = fecha.getYear();
		boolean result = false;
		
		if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
				result = true;
		}
		
		return result;
	}

}
