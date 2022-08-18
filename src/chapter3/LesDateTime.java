package chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LesDateTime {

	public static void main(String[] args) {
		
		//Part 1 : Creation de date et time avec API Java 8
		/*
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);*/
		/*LocalDate ld = LocalDate.of(1980, 12, 1);
		System.out.println(ld);
		LocalTime lt = LocalTime.of(15, 40);
		LocalDateTime ldt =LocalDateTime.of(ld, lt);
		System.out.println(ldt);*/
		
		//Part 2 : Manipulation de date et time
		/*
		LocalDate ld = LocalDate.of(1980, 12, 1);
		ld = ld.plusMonths(2);
		ld = ld.plusYears(5);
		//System.out.println(ld.plusMonths(2));
		System.out.println(ld);*/
		/*
		Period p = Period.of(1, 3, 10);
		LocalDate ld = LocalDate.of(1980, 12, 1);
		ld = ld.plus(p);
		System.out.println(ld);*/
		
		//Part 3 : Formattage de date et time
		LocalDate ld = LocalDate.of(1980, 12, 1);
		System.out.println(ld);
		
		DateTimeFormatter formatFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter formatLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter formatMed = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(ld.format(formatFull));
		System.out.println(ld.format(formatLong));
		System.out.println(ld.format(formatMed));
		System.out.println(ld.format(formatShort));
		
		DateTimeFormatter monformat = DateTimeFormatter.ofPattern("MMMM-yyyy:dd");
		System.out.println(ld.format(monformat));
		

	}

}
