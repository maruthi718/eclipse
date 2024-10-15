package pac1;
 
import java.time.Instant;

import java.time.LocalDate;

import java.time.ZoneId;


import java.time.ZonedDateTime;
 
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
 
public class Date {
 
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Instant CurrentTime=Instant.now();

		LocalDate now=LocalDate.now();

		System.out.println("Today is "+now);

		System.out.println("tomorrow "+now.plusDays(1));

		System.out.println("yesterday "+now.minusDays(1));

		System.out.println("current time is "+CurrentTime);

		System.out.println("is leap? "+now.isLeapYear());

		System.out.println("move to 30th day of month "+now.withDayOfYear(30));

		ZonedDateTime ct=ZonedDateTime.now();

		System.out.println("Zone date and time "+ct);

		ZonedDateTime ct_paris=ZonedDateTime.now(ZoneId.of("Europe/Paris"));

		System.out.println("Paris time is "+ct_paris);

		System.out.println("tomorrow "+ct_paris.plusDays(1));

		System.out.println("yesterday "+ct_paris.minusDays(1));

		System.out.println("current time is "+ct_paris.minusMonths(1));
 
 
	}
 
}

 