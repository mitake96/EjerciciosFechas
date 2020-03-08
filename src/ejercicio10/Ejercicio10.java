package ejercicio10;

import java.time.LocalDate;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(1996, 9, 1);

		System.out.println(esBisiesto(date));
	}
	
	public static boolean esBisiesto(LocalDate fecha) {
		
		int a�o = fecha.getYear();
		boolean result = false;
		
		if (a�o % 4 == 0 && (a�o % 100 != 0 || a�o % 400 == 0)) {
				result = true;
		}
		
		return result;
	}

}
