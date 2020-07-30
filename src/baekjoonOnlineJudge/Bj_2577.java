package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double multiplicationResult = 1;
		double million = 1000000;
		int[] numberCount = new int[10];
		
		for(int i=0; i<3; i++) {
			multiplicationResult *= sc.nextInt();
		}
		if(multiplicationResult/(100*million) > 1 && multiplicationResult/(100*million) < 10) { // 1억 대 숫자
			// System.out.println("multiplicationResult= "+multiplicationResult);
			for(int i=0, digit=0, remainder = 10, multiplier=1; i<9; i++, multiplier *= 10) {
				digit = (int)(multiplier * multiplicationResult / (100*million)%remainder);
				// System.out.println("digit= " + digit);
				numberCount[digit]++;
			}
		}
		if(multiplicationResult/(10*million) > 1 && multiplicationResult/(10*million) < 10) { // 1000만 대 숫자
			// System.out.println("multiplicationResult= "+multiplicationResult);
			for(int i=0, digit=0, remainder = 10, multiplier=1; i<8; i++, multiplier *= 10) {
				digit = (int)(multiplier * multiplicationResult / (10*million)%remainder);
				// System.out.println("digit= " + digit);
				numberCount[digit]++;
			}
		}
		if(multiplicationResult/million > 1 && multiplicationResult/million < 10) { // 100만 대 숫자
			// System.out.println("multiplicationResult= "+multiplicationResult);
			for(int i=0, digit=0, remainder = 10, multiplier=1; i<7; i++, multiplier *= 10) {
				digit = (int)(multiplier * multiplicationResult / (1*million)%remainder);
				// System.out.println("digit= " + digit);
				numberCount[digit]++;
			}
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(numberCount[i]);
		}
	}

}

