package º∆À„»’∆⁄;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDemo {

	public static Integer whatWeek(String datetime) throws java.text.ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(datetime);
		Calendar calendar = Calendar.getInstance();
		calendar.setFirstDayOfWeek(Calendar.MONDAY);
		calendar.setTime(date);
		Integer weekNumbe = calendar.get(Calendar.WEEK_OF_YEAR);
		return weekNumbe;
    }

}
