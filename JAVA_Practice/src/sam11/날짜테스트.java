package sam11;

//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//import java.util.Calendar;
//import java.util.Date;

public class 날짜테스트 {
	
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate); 	// 2022-05-02
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime); 	// 17:23:17.175532800
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime); 	// 2022-05-02T17:23:17.175532800
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
		System.out.println(localDateTime.format(dateTimeFormatter)); 	// 2022-05-02 17:23:17

		System.out.println(localDateTime.plusYears(1).plusMonths(1).plusDays(1).format(dateTimeFormatter)); // 2023-06-03 17:25:30

	}

}
