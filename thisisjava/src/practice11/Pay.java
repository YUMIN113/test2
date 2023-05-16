package practice11;

public class Pay {

	private int hourPay;

	public Pay(int hourPay) {
		this.hourPay = hourPay;
	}
	
	public int getDayPay() {
		return hourPay * 8;
	}
	
	public int getWeekPay() {
		return this.getDayPay() * 5;
	}
	
	public int getYearPay() {
		return this.getWeekPay() * 52;
	}
	
}
