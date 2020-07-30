package baekjoonOnlineJudge;

import java.io.*;

public class Bj_5543 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cheapestBurger = 2000;
		int cheapestBeverage = 2000;
		
		int menu[] = new int[5];
		for(int i=0; i<5; i++) {
			menu[i] = Integer.parseInt(br.readLine());
			if(i<3) {
				if(menu[i]<cheapestBurger) {
					cheapestBurger = menu[i];
				}
			}
			if(i<5) {
				if(menu[i]<cheapestBeverage) {
					cheapestBeverage = menu[i];
				}
			}
		}
		System.out.println(cheapestBurger+cheapestBeverage-50);
	}
}
