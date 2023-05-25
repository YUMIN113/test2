package test;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int testCase = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < testCase; i++) {
			
			int x = 0;
			int y = 0; 
	
			int length = Integer.parseInt(sc.nextLine());
			
			String[][] arr = new String[length][length];
			
			for(int j = length - 1; j >= 0; j--) {
				st = new StringTokenizer(sc.nextLine(), " ");
				for(int k = 0; k < length; k++) {
					arr[j][k] = st.nextToken();
					if(arr[j][k] == "X") {
						x = j;
						y = k;
					}
				}
			}

			int count = 0;
			
			for(int j = x + 1; j < length - 1; j++) {
				if(arr[j][y] == "Y") {
					break;
				}
				
				if(arr[j][y] == "L") {
					continue;
				}
				if(arr[j][y] == "H" && arr[j + 1][y] == "H") {
					count++;
				}	
			}
			
			for(int j = x - 1; j > 0; j--) {
				if(arr[j][y] == "Y") {
					break;
				}
				
				if(arr[j][y] == "L") {
					continue;
				}
				if(arr[j][y] == "H" && arr[j - 1][y] == "H") {
					count++;
				}	
			}
			
			for(int k = y + 1; k < length - 1; k++) {
				if(arr[x][k] == "Y") {
					break;
				}
				
				if(arr[x][k] == "L") {
					continue;
				}
				if(arr[x][k] == "H" && arr[x][k + 1] == "H") {
					count++;
				}	
			}
			
			for(int k = y - 1; k > 0; k--) {
				if(arr[x][k] == "Y") {
					break;
				}
				
				if(arr[x][k] == "L") {
					continue;
				}
				if(arr[x][k] == "H" && arr[x][k - 1] == "H") {
					count++;
				}	
			}
			System.out.println("#" + (i + 1) + " " + count);
			}

	}

   }

