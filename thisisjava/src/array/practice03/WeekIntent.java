package array.practice03;

import java.util.StringTokenizer;

public class WeekIntent {

	public static void main(String[] args) {

		String daysString = "일,월,화,수,목,금,토";
		StringTokenizer st = new StringTokenizer(daysString, ",");
		
		String[] arr = new String[7];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = st.nextToken() + "요일";
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("     ");
			}
			System.out.println(arr[i]);
		}
		
	}

}
