package baekjoonOnlineJudge;

import java.util.Scanner;

public class Bj_10996 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			System.out.print("*");
			for(int j=0; j<Math.floor((N-0.1)/2); j++){
				System.out.print(" *");
			}
			System.out.println();
			for(int j=0; j<N/2; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}			
	}
}
