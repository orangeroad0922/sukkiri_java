package sukkiri_java.chapter14.q14_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		SimpleDateFormat format = new SimpleDateFormat("西暦yyyy年MM月dd日");

		Date now = new Date();
		System.out.println("現在日時　：" +format.format(now));

		Calendar cal = Calendar.getInstance();
		cal.setTime(now);

		int day = cal.get(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DAY_OF_MONTH, day + 100);

		Date after100days = cal.getTime();
		System.out.println("１００日後：" +format.format(after100days));
	}
}
