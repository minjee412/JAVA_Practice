package sam11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 날짜테스트2 {
	
	public static void main(String[] args) {
		Date today = Calendar.getInstance().getTime();
		System.out.println(today); 	// Mon May 02 17:11:01 KST 2022
		
//		int year = today.getYear(); // @Deprecated -> 왠만하면 사용하지 말라는 의미
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(year); 	// 2022
		System.out.println(Calendar.getInstance()); 
//		java.util.GregorianCalendar[time=1651479205888,
//		areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",
//		offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,
//		minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,
//		DAY_OF_YEAR=122,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=13,SECOND=25,
//		MILLISECOND=888,ZONE_OFFSET=32400000,DST_OFFSET=0]

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD");
		System.out.println(simpleDateFormat); 	// java.text.SimpleDateFormat@4bd0f600
		System.out.println(simpleDateFormat.format(today)); 	// 2022-05-122

		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
		System.out.println(simpleDateFormat2.format(today));	// 2022-05-122 17:18:37

	}

}
