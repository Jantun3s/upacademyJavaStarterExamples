package pt.upacademy.desafios.desafio5;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Desafio {

	public static int countDays(String string, String string2) {
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
		LocalDate begin = LocalDate.parse(string, formatter);
		LocalDate end = LocalDate.parse(string2, formatter);
		
//		String[] arrayBegin = string.split(" ");
//		String[] arrayEnd = string2.split(" ");
//	
//		LocalDate begin = LocalDate.of(Integer.parseInt(arrayBegin[2]), Month.of(Integer.parseInt(arrayBegin[1])), Integer.parseInt(arrayBegin[0]));
//		LocalDate end = LocalDate.of(Integer.parseInt(arrayEnd[2]), Month.of(Integer.parseInt(arrayEnd[1])), Integer.parseInt(arrayEnd[0]));
//		
		int days = (int) ChronoUnit.DAYS.between(begin, end);
		
		return days;
	}

}
