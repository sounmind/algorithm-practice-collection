package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[3];
		int tmp = 0;
		
		for(int i=0; i<3; i++) {
			input[i] = sc.nextInt();
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(input[i] > input[j]) {
					tmp = input[i];
					input[i] = input[j];
					input[j] = tmp;
				}
			}
		}
		System.out.println(input[1]);	
	}
}
