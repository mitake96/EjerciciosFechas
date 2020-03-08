package ejercicio2;

import java.time.LocalTime;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime hora = LocalTime.now();
		double nanosegundos;
		
		nanosegundos = ((hora.getSecond() + (hora.getMinute() * 60) + (hora.getHour() * 3600)) * Math.pow(10, 9)) + hora.getNano();

		
		System.out.printf("%.0f Nanosegundos con fórmula \n", nanosegundos);
		System.out.println(hora.toNanoOfDay() + " Nanosegundos con la clase LocalTime");
	}

}
