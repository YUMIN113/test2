package thread_practice.practice05;

public class AtmApp {

	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount("A-001", 700);

		Atm seoul = new Atm(bankAccount, "서울");
		Atm jeju = new Atm(bankAccount, "제주");

		// 동일 계좌에 동시 접근
		seoul.start();
		jeju.start();

	}

}
