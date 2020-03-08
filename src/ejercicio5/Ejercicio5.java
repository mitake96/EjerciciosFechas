package ejercicio5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter form = DateTimeFormatter.ofPattern("h:mm");
		
		/* Inicio */
		System.out.printf("Hoy es %s %s a las %s",
					now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()), now.toLocalDate(), form.format(now.toLocalTime()));

	}
}
