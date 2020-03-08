package ejercicio9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Ejercicio9 {
	
	public static boolean fechaCorrecta(String fecha) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/LL/yyyy");
		boolean result = false;
		
		try {
			LocalDate.parse(fecha, format);
			result = true;
		} catch (DateTimeParseException e) {
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(fechaCorrecta("01/09/1996"));
	}

}
