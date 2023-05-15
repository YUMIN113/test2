package ch04.sec02;

public class HakjumSwitchApp {

	public static void main(String[] args) {


		int korean = 88;
		int english = 92;
		int math = 60;
		
		System.out.println("국어=" + korean);
		System.out.println("영어=" + english);
		System.out.println("수학=" + math);
		
		int sum = korean + english + math;
		int avg = sum / 3;
		
		String grade = " ";
		
		switch(avg / 10) { 
			
		case 9, 10 ://90을 10으로나눔. 100을 10으로 나눔
			grade = "A";
			break;
			
		case 8 :
			grade = "B";
			break;
			
		case 7 :
			grade = "C";
			break;
			
		default ://그 외의 것들
			grade = "D";
			break;
		}
		
		System.out.println("합계=" + sum);
		System.out.println("평균=" + avg);
		System.out.println("학점=" + grade);

	}

}
