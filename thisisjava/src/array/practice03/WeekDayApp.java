package array.practice03;

import java.util.Arrays;

public class WeekDayApp {

	public static void main(String[] args) {
		
		String[] weekDay;
		
		weekDay = new String[7];
		
		weekDay[0] = new String("월요일");
		weekDay[1] = new String("화요일");
		weekDay[2] = new String("수요일");
		weekDay[3] = new String("목요일");
		weekDay[4] = new String("금요일");
		weekDay[5] = new String("토요일");
		weekDay[6] = new String("일요일");
		
		System.out.println("===== Week Day =====");
		for(int i = 0; i < weekDay.length; i++) {
			System.out.println("weekDay[" + i + "] " + weekDay[i]);
		}

	}

}
