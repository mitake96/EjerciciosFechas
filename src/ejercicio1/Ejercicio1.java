package ejercicio1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		LocalDate fecha = LocalDate.of(2020, 3, 6);
		DayOfWeek day = fecha.getDayOfWeek();
		Locale l = new Locale("es", "ES");
		
		System.out.println(day.getDisplayName(TextStyle.FULL, l));
		
	}

}
