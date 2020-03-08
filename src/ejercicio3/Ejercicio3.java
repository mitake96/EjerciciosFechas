package ejercicio3;

import java.time.LocalDate;
import java.time.Period;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LocalDate fecha_nac = LocalDate.parse("1996-09-01");
		LocalDate now = LocalDate.now();
		Period periodo = Period.between(fecha_nac, now);
		
		System.out.println(periodo.getYears());
		
		

	}

}
