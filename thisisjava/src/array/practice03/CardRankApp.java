package array.practice03;

import java.util.Arrays;

public class CardRankApp {

	public static void main(String[] args) {


		String[] cardRanks;
		
		cardRanks = new String[13];
		
		for(int i = 1; i <= 10; i++) {
			cardRanks[i - 1] = String.valueOf(i);
		}
		
		cardRanks[10] = "Jack";
		cardRanks[11] = "Queen";
		cardRanks[12] = "King";

		System.out.println("===== Card Ranks =====");
		
		for(int i = 0; i < cardRanks.length; i++) {
			System.out.println("cardRanks[" + i + "] " + cardRanks[i]);
		}
		
	}

}
