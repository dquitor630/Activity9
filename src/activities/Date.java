package activities;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Date {
	private final static LocalDate currentDate = LocalDate.now();
	private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy ", Locale.ENGLISH);
	private final static DateTimeFormatter formatterHour = DateTimeFormatter.ofPattern("HH:mm:ss");

	public int daysBetween(int day, int month) {
		LocalDate firstDate = LocalDate.of(currentDate.getYear(), 1, 1);
		LocalDate insertedDate = LocalDate.of(currentDate.getYear(), month, day);
		return (int) (ChronoUnit.DAYS.between(firstDate, insertedDate));
	}

	public DayOfWeek getDayOfWeek(LocalDate date) {
		return date.getDayOfWeek();

	}

	public boolean validDate(String date) {
		try {
			LocalDate.parse(date);
		} catch (DateTimeParseException e) {
			return false;
		}
		return true;
	}

	public boolean isLeapYear(Year year) {
		if (year.getValue() % 100 == 0 && year.getValue() % 400 == 0) {
			return true;
		} else if (year.getValue() % 100 == 0) {
			return false;
		} else if (year.getValue() % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int age(LocalDate date) {
		return (int) (Math.floor((double) ChronoUnit.DAYS.between(date, currentDate) / 365));
	}

	public String getMoment() {
		LocalDateTime currentDateTime = LocalDateTime.now();
		return "today is " + String.valueOf(currentDate.getDayOfWeek()).toLowerCase() + " "
				+ formatter.format(currentDateTime.toLocalDate()) + "at "
				+ formatterHour.format(currentDateTime.toLocalTime());
	}

}
