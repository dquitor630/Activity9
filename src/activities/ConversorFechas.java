package activities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class ConversorFechas {

	public String normalToAmericano(String dateString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatterAmerican = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.US);
		LocalDate date = LocalDate.of(0000, 1, 1);
		try {
			date = LocalDate.parse(dateString, formatter);
		} catch (DateTimeParseException e) {
			System.out.println("Has introducido una fecha errónea");
		}
		return formatterAmerican.format(date);
	}

	public String americanoToNormal(String dateString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
		DateTimeFormatter formatterAmerican = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date = LocalDate.of(0000, 1, 1);
		try {
			date = LocalDate.parse(dateString, formatterAmerican);
		} catch (DateTimeParseException e) {
			System.out.println("has introducido una fecha errónea");
		}
		return formatter.format(date);
	}

}