package ejercicio6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;

public class Ejercicio6 {
	
	public static void diasPasados(LocalDate date){
		
		LocalDate fechainicial = LocalDate.of(Year.now().getValue(), 1, 1);
		Period diferencia = Period.between(fechainicial, date);
		
		if (fechainicial.getYear() != date.getYear()) {
			throw new IllegalArgumentException("Introduzca una fecha de este año.");
		}
		
		System.out.printf("Han pasado: %s meses y %s dias desde el 1 de Enero\n\n",
				diferencia.getMonths(), diferencia.getDays());
		
		System.out.printf("Han pasado %d dias desde el 1 de Enero", date.getDayOfYear());
	}
	
	public static void main(String[] args) {
		diasPasados(LocalDate.of(2020, Month.SEPTEMBER, 21));

	}

}
