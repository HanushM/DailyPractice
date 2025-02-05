import java.time.*;
import java.util.*;
import static java.time.Month.*;

public class DateAndTime{
	public static void main(String args[]){
		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		LocalTime ld2 = LocalTime.now();
		LocalDateTime ld3 = LocalDateTime.now();

		System.out.println(ld2);
		System.out.println(ld3);

		System.out.println(ld.getMonth());
		System.out.println(ld.withMonth(12));

		LocalDate d2 = LocalDate.of(2004,Month.JUNE,21);
		System.out.println(d2);

		LocalDate d3 = LocalDate.of(2004,JUNE,21);
		System.out.println(d3);

		Set s = ZoneId.getAvailableZoneIds();
		s.forEach(System.out::println);

		LocalTime d4 = LocalTime.now(ZoneId.of("Singapore"));
		System.out.println(d4);
	}
}