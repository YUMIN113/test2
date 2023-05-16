package practice11;

public class PayApp {

	public static void main(String[] args) {
		
		int hourPay = 9620;
		Pay p = new Pay(hourPay);
		
		System.out.println("\n===== 하루 급여 =====");
		int dayPay = p.getDayPay();
		System.out.println("급여=" + dayPay);
		
		System.out.println("\n===== 주 급여 =====");
		int weekPay = p.getWeekPay();
		System.out.println("급여=" + weekPay);
		
		System.out.println("\n===== 연 급여 =====");
		int yearPay = p.getYearPay();
		System.out.println("급여=" + yearPay);

	}

}
