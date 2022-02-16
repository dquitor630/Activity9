package activities;

import java.time.LocalDate;
import java.time.Year;

public class Main {
	public static void main(String[] args) {
		new Main().pruebas();
	}

	public void pruebas() {
		ConversorFechas conversor = new ConversorFechas();
		Year year = Year.parse("2003");
		Date dateClass = new Date();
		LocalDate date = LocalDate.of(2003, 5, 14);
		System.out.println(dateClass.daysBetween(12, 5));
		System.out.println(dateClass.getDayOfWeek(date));
		System.out.println(dateClass.validDate("2022-02-28"));
		System.out.println(dateClass.isLeapYear(year));
		System.out.println(dateClass.age(date));
		System.out.println(dateClass.getMoment());
		System.out.println(conversor.normalToAmericano("14/05/2003"));
		System.out.println(conversor.americanoToNormal("05/14/2003"));
	}
}
