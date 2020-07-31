package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_2438 {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int j = 0; j<num; j++) {
			for(int i=0; i<=j; i++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
    }
}
